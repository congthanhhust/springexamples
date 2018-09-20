package edu.java.spring;


import org.springframework.beans.factory.DisposableBean;

public class HelloClazz implements DisposableBean {

	String message;
	
	public HelloClazz() {
		message = "From Contructor: Say hello everyone";
	}

	public void setMessage(String message) {
		this.message = "Call From Setter: " + message;
	}

	public String getMessage(){
		return message;
	}
	
	private void initMessage() {
		message = "From init method: Say hello bean!";
	}
	
	public void printMessage() {
		System.out.println("Your message: " + message);
	}
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		message = null;
		System.out.println("Message is null");
	}
}
