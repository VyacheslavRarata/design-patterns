package org.patterns;

import java.util.LinkedList;
import java.util.List;

public class InMemoryStrategy implements Strategy {

	private List<String> messages = new LinkedList<>();

	@Override
	public void print(String message) {
		messages.add(message);
	}

	public List<String> getMessages() {
		return messages;
	}

}
