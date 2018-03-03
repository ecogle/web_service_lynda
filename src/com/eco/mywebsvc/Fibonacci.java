package com.eco.mywebsvc;

import javax.jws.WebService;

@WebService
public class Fibonacci {

	public Integer getFibTotal(String str) {
		Integer num = new Integer(str);
		int counter = 0;
		int sum = 0;
		//the sequence is added together to get a total
		do {
			sum = sum+counter;
			counter++;
		}while(counter<=num);
		
		
		
		return sum;
	}
	
	/*public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.getFibTotal("5"));
	}*/
}
