package com.nikhiljadav.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nikhiljadav.service.Calculator;

public class CalculatorTest {
	Calculator calculator = new Calculator();

	@Test
	public void testAddition() {
		assertEquals(5, calculator.add(2, 3));
	}

	@Test
	public void testSubtraction() {
		assertEquals(1, calculator.subtract(3, 2));
	}

	@Test
	public void testFailingAddition() {
		assertEquals(9, calculator.add(4, 5));
	} // intentional fail
}
