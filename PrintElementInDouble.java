package com.lamdaexpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class PrintElementInDouble {
	
public static void main(String args[]) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(9);
		list.add(8);
		list.add(1);
		list.add(4);
	
		System.out.println("********For Each***********");
		Consumer<Integer> consumer = n -> {System.out.println((double)n);};
		list.forEach(consumer);
		
	}
}