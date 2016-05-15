package org.patterns;

public abstract class Decorator implements Component {

	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void run(String message) {
		component.run(message);
	}

}
