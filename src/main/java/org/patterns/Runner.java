package org.patterns;

public class Runner implements Component {

	private Observable observable = new ObservableImpl();

	public void addTarget(Target target) {
		observable.addObserver(new TargetObserverAdapter(target));
	}

	@Override
	public void run(String message) {
		observable.notifyAllObservers(message);
	}

}
