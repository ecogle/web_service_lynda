package com.eco.consumer;

import javax.xml.ws.WebServiceRef;

import com.eco.mywebsvc.HelloWorld;

public class Hello {
	
	@WebServiceRef(wsdlLocation="https://Laptop:8181/First_Web_Service/HelloWorldService?wsdl")
	static HelloWorld service = new HelloWorld();
	
	public static void main(String[] args) {
		
		HelloWorld d = new HelloWorld();
		
		System.out.println(d.sayHello("Chad"));
	}

}
