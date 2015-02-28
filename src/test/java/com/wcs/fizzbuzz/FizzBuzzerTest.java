package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

	private FizzBuzzer fizzBuzzer = new FizzBuzzer();

	@Test
	public void executeShouldReturnFizzIfTheNumberIsDividableBy3() {
		assertEquals("fizz", fizzBuzzer.execute(3));
	}

	@Test
	public void executeShouldReturnBuzzIfTheNumberIsDividableBy5() {
		assertEquals("buzz", fizzBuzzer.execute(5));
		assertEquals("buzz", fizzBuzzer.execute(10));
	}

	@Test
	public void executeShouldReturnBuzzIfTheNumberIsDividableBy15() {
		assertEquals("fizzbuzz", fizzBuzzer.execute(15));
		assertEquals("fizzbuzz", fizzBuzzer.execute(30));
	}

	@Test
	public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
		assertEquals("1", fizzBuzzer.execute(1));
		assertEquals("2", fizzBuzzer.execute(2));
		assertEquals("4", fizzBuzzer.execute(4));
		//assertEquals("7", fizzBuzzer.execute(7));
	}

	@Test
	public void executeShouldReturnWizzIfTheNumberIsDividableBy7() {
		assertEquals("wizz", fizzBuzzer.execute(21));
		assertEquals("wizz", fizzBuzzer.execute(35));
	}

	@Test
	public void executeShouldRerturnFizzIfTheNumberContains3() {
		assertEquals("fizz", fizzBuzzer.execute(43));
	}

	@Test
	public void executeShouldRerturnBuzzIfTheNumberContains5() {
		assertEquals("buzz", fizzBuzzer.execute(54));
	}

	@Test
	public void executeShouldRerturnWizzIfTheNumberContains7() {
		assertEquals("wizz", fizzBuzzer.execute(74));
	}
}
