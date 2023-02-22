package com.lamdaexpression;

public class MathOperation {
	
	interface FuncInterface{
		int calculate(int a, int b);
	}

	public static void main(String args[]) {
	
		FuncInterface add = (a,b) -> a+b;
		FuncInterface sub = (a,b) -> a-b;
		FuncInterface multiply = (a,b) -> a*b;
		FuncInterface div = (a,b) -> a/b;
		
		System.out.println("Addition is "+add.calculate(25, 15));
		System.out.println("Addition is "+sub.calculate(15, 5));
		System.out.println("Addition is "+multiply.calculate(15, 5));
		System.out.println("Addition is "+div.calculate(15, 5));
	}
}