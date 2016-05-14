package org.patterns;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class RunAppTest {

	@Test
	public void test() {

		// given
		InMemoryStrategy strategy = new InMemoryStrategy();
		RunApp runApp = new RunApp(new Adapter(strategy));
		// when
		runApp.run();
		// then
		assertEquals("[Hello Patterns!, Hello Adapter!]", strategy.getMessages().toString());
	}

	protected List<String> messages = new LinkedList<>();

	@Test
	public void test2() {

		// given

		RunApp runApp = new RunApp(new Target() {
			@Override
			public void addMessages(String... messages) {
				RunAppTest.this.messages.addAll(Arrays.asList(messages));
			}
		});
		// when
		runApp.run();
		// then
		assertEquals("[Hello Patterns!, Hello Adapter!]", messages.toString());
	}

}
