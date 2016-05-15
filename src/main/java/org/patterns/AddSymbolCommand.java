package org.patterns;

public class AddSymbolCommand implements Command {

	private AbstractFactory factory;

	public AddSymbolCommand(AbstractFactory factory) {
		this.factory = factory;
	}

	@Override
	public void change(Request request) {
		request.setMessage(request.getMessage() + factory.getSymbol().get());
	}

}
