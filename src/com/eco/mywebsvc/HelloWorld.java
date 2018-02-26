package com.eco.mywebsvc;

import javax.jws.WebService;

@WebService
public class HelloWorld {

	public String sayHello(String s) {
		return "Hello " + s;
	}
	
	public void constructor() {
		
	}
}
