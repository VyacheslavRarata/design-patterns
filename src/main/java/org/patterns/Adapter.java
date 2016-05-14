package org.patterns;

public class Adapter implements Target {

	private Strategy strategy;

	public Adapter(Strategy strategy) {
		this.strategy = strategy;
	}

	@Override
	public void addMessages(String... messages) {
		for (String message : messages) {
			strategy.print(message);
		}
	}

}
