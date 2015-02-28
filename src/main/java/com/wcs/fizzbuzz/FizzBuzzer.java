package com.wcs.fizzbuzz;

public class FizzBuzzer {

	public String execute(int number) {
		String returnValue = "";
		if (number % 5 == 0) {
			returnValue = "buzz";
			if (number % 3 == 0) {
				return   "fizz" + returnValue;
			}
		}

		if (number % 3 == 0) {
			returnValue = "fizz";
		}

		if (number % 7 == 0) {
			returnValue = "wizz";
		}

		return returnValue.isEmpty() ? Integer.toString(number) : returnValue;
	}
}
