package org.patterns;

public abstract class Handler {

	private Handler next;
	public static final Handler NULL = new NullHandler();

	public void addNext(Handler next) {
		this.next = next;
	}

	public void handle(Request request) {
		handleRequest(request);
		
		if (next != null) {
			next.handle(request);
		}
		
		doAfterAll(request);
	}

	protected void doAfterAll(Request request) {
		// implement in subclass
	}

	protected abstract void handleRequest(Request request);

}
