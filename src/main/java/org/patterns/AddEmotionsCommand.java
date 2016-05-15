package org.patterns;

public class AddEmotionsCommand implements Command {

	private AbstractFactory factory;

	public AddEmotionsCommand(AbstractFactory factory) {
		this.factory = factory;
	}

	@Override
	public Request change(Request request) {
		Request changed = new Request(request.getMessage() + factory.getSmile().get());
		return changed;
	}

}
