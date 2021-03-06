package org.patterns;

public class ReplaceSpaceTo extends Decorator {

	private String replacement = "-";

	public ReplaceSpaceTo(Component component) {
		super(component);
	}

	@Override
	public void run(String message) {
		super.run(message.replaceAll(" ", replacement));
	}

}
