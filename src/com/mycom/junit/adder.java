package com.mycom.junit;

public class adder {
	public int addition(String expression){
		int sum = 0;
		for(String summand:expression.split("\\+"))
		  sum+=Integer.valueOf(summand);
		return sum;
		}
}
