package com.wcs.fizzbuzz;

public class FizzBuzzer {

	public String execute(int number) {
		String stringNumber = Integer.toString(number);
		String returnValue = "";

		if (number % 5 == 0 && number % 3 == 0) {
			return "fizzbuzz";
		}

		if (number % 3 == 0 || stringNumber.contains("3")) {
			returnValue += "fizz";
		}

		if (number % 5 == 0 || stringNumber.contains("5")) {
			returnValue += "buzz";
		}

		if (number % 7 == 0 || stringNumber.contains("7")) {
			returnValue += "wizz";
		}

		return returnValue.isEmpty() ? stringNumber : returnValue;
	}
}
