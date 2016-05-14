package org.patterns;

public class ConsoleStrategy implements Strategy {

	@Override
	public void print(String message) {
		System.out.println(message);
	}

}
