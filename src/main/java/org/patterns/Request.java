package org.patterns;

public final class Request {

	private final String message;

	public Request(Request request) {
		this.message = request.getMessage();
	}
	public Request(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
