package org.patterns;

/**
 * @author Rarata Vyacheslav
 *
 */
public class Main {

	public static void main(String[] args) {
		String message = "Hello Patterns";
		AbstractFactory factory = new SadFactory();
		proccess(message, factory);
	}

	private static void proccess(String message, AbstractFactory factory) {
		Runner runner = RunnerFactory.create();
		runner.addTarget(new Adapter(ConsoleStrategy.getInstance()));

		InMemoryStrategy inMemory = new InMemoryStrategy();
		runner.addTarget(new Adapter(inMemory));

		runner.addHandler(new HelloPatternsHandler(new AddSymbolCommand(factory)));
		runner.addHandler(new HelloPatternsHandler(new AddEmotionsCommand(factory)));
		// decoration
		Component component = runner;
		component = new ToUpperCaseDecorator(component);
		component = new ReplaceSpaceTo(component, factory.getSymbol().get());
		component.run(message);
	}

}
