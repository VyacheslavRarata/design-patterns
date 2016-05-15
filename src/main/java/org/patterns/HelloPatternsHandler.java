package org.patterns;

public class HelloPatternsHandler extends Handler {

	private final String symbol;

	public HelloPatternsHandler(String symbol) {
		this.symbol = symbol;
	}

	@Override
	protected void handleRequest(Request request) {
		String hello = request.getMessage().toLowerCase();
		if (hello.contains("hello") && hello.contains("patterns")) {
			request.setMessage(request.getMessage() + symbol);
		}

	}

}
