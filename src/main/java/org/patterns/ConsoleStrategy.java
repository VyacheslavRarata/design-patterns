package org.patterns;

public final class ConsoleStrategy implements Strategy {

	private static Strategy instance = new ConsoleStrategy();

	private ConsoleStrategy() {
	}

	@Override
	public void print(String message) {
		System.out.println(message);
	}

	public static Strategy getInstance() {
		return instance = (instance == null) ? new ConsoleStrategy() : instance;
	}

}
