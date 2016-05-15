package org.patterns;

import java.util.LinkedList;
import java.util.List;

public class ObservableImpl implements Observable {

	private List<Observer> observers = new LinkedList<>();

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers(String message) {
		for (Observer observer : observers) {
			observer.handle(message);
		}
	}

}
