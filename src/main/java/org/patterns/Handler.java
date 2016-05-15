package org.patterns;

public abstract class Handler {

	private Handler next;
	public static final Handler NULL = new NullHandler();

	public void addNext(Handler next) {
		this.next = next;
	}

	public void handle(Request request) {
		if (next != null) {
			next.handle(request);
		}
	}

}
