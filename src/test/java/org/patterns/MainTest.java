package org.patterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 * 
 * this is integration test
 */
public class MainTest {

	@Test
	public void test() {
		// given
		ConsoleMock console = new ConsoleMock();
		// when
		Main.main(new String[0]);
		// then
		assertEquals("HELLO-PATTERNS\u2639\r\n", console.getOut());
	}
}
