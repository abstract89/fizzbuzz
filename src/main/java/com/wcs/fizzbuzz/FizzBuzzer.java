package com.wcs.fizzbuzz;

public class FizzBuzzer {

	public String execute(int number) {
		if(number % 5 == 0 && number % 3 == 0) {
			return "fizzbuzz";
		}
		
		return Integer.toString(number);
	}

}
