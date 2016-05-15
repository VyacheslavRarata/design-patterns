package org.patterns;

public abstract class Handler {

	private Handler next;
	public static final Handler NULL = new NullHandler();

	public void addNext(Handler next) {
		this.next = next;
	}

	public Request handle(Request request) {
		Request changed = handleRequest(request);
		
		if (next != null) {
			changed = next.handle(changed);
		}
		
		doAfterAll(changed);
		return changed;
	}

	protected void doAfterAll(Request request) {
		// implement in subclass
	}

	protected abstract Request handleRequest(Request request);

}
