package edu.java.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ctx.registerShutdownHook();
		ctx.register(AppConfig.class);
		ctx.refresh();
		
		HelloClazz helloClazz = (HelloClazz) ctx.getBean("bean2");
    	helloClazz.printMessage();
    	System.out.println(helloClazz + "\n");
    	
    	HelloClazz helloClazz2 = (HelloClazz) ctx.getBean("bean2");
    	helloClazz2.printMessage();
    	System.out.println(helloClazz2 + "\n");
    	System.out.println(helloClazz == helloClazz2);
	}

}
