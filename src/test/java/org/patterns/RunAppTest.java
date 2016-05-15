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
		Component component = new RunApp(new Adapter(strategy));
		// when
		component.run("Hello Patterns!");
		// then
		assertEquals("[Hello Patterns!]", strategy.getMessages().toString());
	}

	protected List<String> messages = new LinkedList<>();

	@Test
	public void test2() {

		// given
		Component component = new RunApp(new Target() {
			@Override
			public void addMessages(String... messages) {
				RunAppTest.this.messages.addAll(Arrays.asList(messages));
			}
		});
		// when
		component.run("Hello Patterns!");
		// then
		assertEquals("[Hello Patterns!]", messages.toString());
	}

}
