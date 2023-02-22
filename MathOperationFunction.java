package com.lamdaexpression;

public class MathOperationFunction {
	
	interface IMathFunction{
		
		int calculate(int a, int b);
		
		static void printResult(int a,int b, String function,IMathFunction fobj) {
			System.out.println("Result of "+function+" is "+fobj.calculate(a, b));
		}
	}
	
	public static void main(String args[]) {
		IMathFunction add = (a,b) -> a+b;
		IMathFunction sub = (a,b) -> a-b;
		IMathFunction multiply = (a,b) -> a*b;
		IMathFunction div = (a,b) -> a/b;
		
		IMathFunction.printResult(3,3,"Addition",add);
		IMathFunction.printResult(9,3,"Substraction",sub);
		IMathFunction.printResult(9,3,"Multiplication",multiply);
		IMathFunction.printResult(9,3,"Division",div);
	}
	
}