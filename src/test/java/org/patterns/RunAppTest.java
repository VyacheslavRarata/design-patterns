package org.patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunAppTest {

	@Test
	public void test() {

		// given
		InMemoryStrategy strategy = new InMemoryStrategy();
		RunApp runApp = new RunApp(strategy);
		// when
		runApp.run();
		// then
		assertEquals("[Hello Patterns!]", strategy.getMessages().toString());
	}

}
