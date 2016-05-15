package org.patterns;

public interface Observable extends MyIterable<Observer>{

	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyAllObservers(String message);
}
