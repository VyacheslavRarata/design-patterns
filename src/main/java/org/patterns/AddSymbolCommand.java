package org.patterns;

public class AddSymbolCommand implements Command {

	private AbstractFactory factory;

	public AddSymbolCommand(AbstractFactory factory) {
		this.factory = factory;
	}

	@Override
	public Request change(Request request) {
		return new Request(request.getMessage() + factory.getSymbol().get());
	}

}
