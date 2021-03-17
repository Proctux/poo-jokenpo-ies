package com.ies.jokenpo;

public class Calculator {
	public Integer valueOne;
	public Integer valueTwo;
	
	public Calculator(Integer valueOne, Integer valueTwo) {
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	
	public Integer decreaseValue() {
		return valueOne - valueTwo;
	}
}
