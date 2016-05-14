package org.patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void test() {
		// given
		ConsoleMock console = new ConsoleMock();

		// when
		App.main(new String[0]);

		// then
		assertEquals("Hello Patterns!\r\n", console.getOut());
	}
}
