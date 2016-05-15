package org.patterns;

public interface Observable {

	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyAllObservers(String message);
}
