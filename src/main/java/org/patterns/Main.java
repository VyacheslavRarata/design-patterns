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
		
		Component component = RunnerBuilder
				.forStrategy(ConsoleStrategy.getInstance())
				.andStrategy(new InMemoryStrategy())
				.andHelloPatternsCommand(new AddEmotionsCommand(factory))
				.andHandler(NullHandler.NULL)
				.andDecorator(ToUpperCaseDecorator.class)
				.andDecorator(ReplaceSpaceTo.class)
				.create();
		component.run(message);
	}

}
