package org.patterns;

public class RunApp {

	private Strategy strategy;

	public RunApp(Strategy strategy) {
		this.strategy = strategy;
	}

	public void run() {
		strategy.print("Hello Patterns!");
	}

}
