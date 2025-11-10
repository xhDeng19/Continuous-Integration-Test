package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result1 = main.add(1, 0);
		assertEquals(1, result1);
		int result2 = main.add(-1, 1);
		int result3 = main.add(1, -1);
		int result4 = main.add(Integer.MAX_VALUE, 1);
	}

}
