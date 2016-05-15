package org.patterns;

public abstract class Handler {

	private Handler next;

	public void addNext(Handler next) {
		this.next = next;
	}

	public void handle(Request request) {
		if (next != null) {
			next.handle(request);
		}
	}

}
