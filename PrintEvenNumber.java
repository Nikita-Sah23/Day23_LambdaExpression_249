package com.lamdaexpression;
import java.util.ArrayList;

public class PrintEvenNumber {

public static void main(String args[]) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(1);
		list.add(4);
	
		System.out.println("********For Each***********");
		list.stream().filter(n -> n%2 == 0).forEach(System.out::println);
		
	}
}