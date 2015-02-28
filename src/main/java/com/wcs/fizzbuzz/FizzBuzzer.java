package com.wcs.fizzbuzz;

public class FizzBuzzer {

	public String execute(int number) {
		String stringNumber = Integer.toString(number);
		String returnValue = "";
		
		if (number % 5 == 0) {
			returnValue = "buzz";
			if (number % 3 == 0) {
				return   "fizz" + returnValue;
			}
		}

		if (number % 3 == 0 || stringNumber.contains("3")) {
			returnValue = "fizz";
		}

		if (number % 7 == 0) {
			returnValue = "wizz";
		}

		return returnValue.isEmpty() ? stringNumber : returnValue;
	}
}
