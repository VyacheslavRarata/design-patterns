package org.patterns;

public class RunnerImpl implements Runner {

	private Observable observable = new ObservableImpl();

	/* (non-Javadoc)
	 * @see org.patterns.Runner#addTarget(org.patterns.Target)
	 */
	@Override
	public void addTarget(Target target) {
		observable.addObserver(new TargetObserverAdapter(target));
	}

	@Override
	public void run(String message) {
		observable.notifyAllObservers(message);
	}

}
