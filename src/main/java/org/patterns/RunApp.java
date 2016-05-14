package org.patterns;

public class RunApp {

	private Target target;

	public RunApp(Target target) {
		this.target = target;
	}

	public void run() {
		target.addMessages("Hello Patterns!", "Hello Adapter!");
	}

}
