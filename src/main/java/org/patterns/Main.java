package org.patterns;

/**
 * @author Rarata Vyacheslav
 *
 */
public class Main {

	public static void main(String[] args) {
		String message = "Hello Patterns";

		Runner runner = RunnerFactory.create();
		runner.addTarget(new Adapter(ConsoleStrategy.getInstance()));

		InMemoryStrategy inMemory = new InMemoryStrategy();
		runner.addTarget(new Adapter(inMemory));

		runner.addHandler(new HelloPatternsHandler(new AddEmotionsCommand("!")));
		runner.addHandler(new HelloPatternsHandler(new AddEmotionsCommand("\u263A")));
		// decoration
		Component component = runner;
		component = new ToUpperCaseDecorator(component);
		component = new ReplaceSpaceTo(component, "-");
		component.run(message);

	}

}
