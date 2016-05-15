package org.patterns;

public class HelloPatternsHandler extends Handler {

	private final Command command;

	public HelloPatternsHandler(Command command) {
		this.command = command;
	}

	@Override
	protected Request handleRequest(Request request) {
		String hello = request.getMessage().toLowerCase();
		if (!hello.contains("hello") || !hello.contains("patterns")) {
			return request;
		}
		return command.change(request);

	}

}
