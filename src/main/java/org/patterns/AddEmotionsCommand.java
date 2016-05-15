package org.patterns;

public class AddEmotionsCommand implements Command {

	private AbstractFactory factory;

	public AddEmotionsCommand(AbstractFactory factory) {
		this.factory = factory;
	}

	@Override
	public void change(Request request) {
		request.setMessage(request.getMessage() + factory.getSmile().get());
	}

}
