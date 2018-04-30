package com.kuni.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
 
@Path("/HelloWorld")
public class HelloWorldService {
	
	public HelloWorldService(){
		super();
	}
 
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/*@GET
	@Path("/sayHello")
	public String sayHello() {
		System.out.println("Hello there!!");
		return "<h1>Hello World</h1>";
	}*/
	
	@GET
	@Path("/showServerCall")
	public String showServerCall() {
		logger.info("Executed the method!");
		return "<h1>Hello World</h1>";
	}
 
}
