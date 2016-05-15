package org.patterns;

public class RunApp implements Component {

	private Target target;

	public RunApp(Target target) {
		this.target = target;
	}

	@Override
	public void run(String message) {
		target.addMessages(message);
	}

}
