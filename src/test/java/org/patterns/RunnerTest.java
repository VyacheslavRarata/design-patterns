package org.patterns;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class RunnerTest {

	@Test
	public void test() {

		// given
		InMemoryStrategy strategy = new InMemoryStrategy();
		Runner runner = new Runner();
		runner.addTarget(new Adapter(strategy));
		// when
		runner.run("Hello Patterns!");
		// then
		assertEquals("[Hello Patterns!]", strategy.getMessages().toString());
	}

	protected List<String> messages = new LinkedList<>();

	@Test
	public void test2() {

		// given
		Runner runner = new Runner();
		runner.addTarget(new Target() {
			@Override
			public void addMessages(String... messages) {
				RunnerTest.this.messages.addAll(Arrays.asList(messages));
			}
		});

		// when
		runner.run("Hello Patterns!");
		// then
		assertEquals("[Hello Patterns!]", messages.toString());
	}

}
