package org.patterns;

/**
 * @author Rarata Vyacheslav
 *
 */
public class App {

	public static void main(String[] args) {
		String message = "Hello Patterns!";

		Component component = new RunApp(new Adapter(ConsoleStrategy.getInstance()));
		component = new ToUpperCaseDecorator(component);
		component = new ReplaceSpaceTo(component, "-");
		component.run(message);

	}

}
