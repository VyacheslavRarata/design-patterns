package org.patterns;

public class AddEmotionsCommand implements Command {

	private String emotion;

	public AddEmotionsCommand(String emotion) {
		this.emotion = emotion;
	}

	@Override
	public void change(Request request) {
		request.setMessage(request.getMessage() + emotion);
	}

}
