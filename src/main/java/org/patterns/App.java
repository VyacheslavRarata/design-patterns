package org.patterns;

/**
 * @author Rarata Vyacheslav
 *
 */
public class App {

	public static void main(String[] args) {
		Strategy strategy = new ConsoleStrategy();
		new RunApp(strategy).run();

	}

}
