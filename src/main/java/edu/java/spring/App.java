package edu.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
//    	HelloClazz helloClazz = (HelloClazz) context.getBean("helloJavaClazz");
//    	helloClazz.printMessage();
//    	System.out.println(helloClazz);
//    	System.out.println();
//
//    	HelloClazz helloClazz2 = (HelloClazz) context.getBean("helloJavaClazz");
//    	helloClazz2.printMessage();
//    	System.out.println(helloClazz2);
//    	System.out.println(helloClazz == helloClazz2);
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.sayHello();
    }
}
