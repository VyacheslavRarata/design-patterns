package org.patterns;

public class RunnerFactory {

	public static Runner create() {
		return new RunnerImpl();
	}
}
