package org.patterns;

public class HelloPatternsHandler extends Handler {

	@Override
	public void handle(Request request) {
		String hello = request.getMessage().toLowerCase();
		if (hello.contains("hello") && hello.contains("patterns")) {
			request.setMessage(request.getMessage() + "!");
		}
		super.handle(request);
	}

}
