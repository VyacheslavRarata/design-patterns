package org.patterns;

public class NullHandler extends Handler {

	@Override
	protected Request handleRequest(Request request) {
		// do nothing
		return request;
	}

}
