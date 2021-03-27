package com.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMathCal {

	
	@Test
	public void testAddPositiveNumbers() {
		MathCal m = new MathCal();
		int r = m.add(10, 20);
		assertEquals(30, r);
	}
	
	@Test
	public void testAddNegNumbers() {
		MathCal m = new MathCal();
		int r = m.add(-10, -20);
		assertEquals(-30, r);
	}
	
	@Test
	public void testAddZeros() {
		MathCal m = new MathCal();
		int r = m.add(-0, -0);
		assertEquals(0, r);
	}
}
