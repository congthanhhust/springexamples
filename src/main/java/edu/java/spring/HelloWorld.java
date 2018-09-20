package edu.java.spring;

import org.apache.log4j.Logger;

public class HelloWorld {
    private final static Logger LOGGER = Logger.getLogger(HelloWorld.class);
    private HelloClazz clazz;


    private String message;

    public HelloWorld(String name, HelloClazz clazz){
        message = "From HelloWorld constructor: " + name +" : " + clazz.getMessage();
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void sayHello(){
        clazz.printMessage();
        LOGGER.info("From HelloWorld: " + message);
    }
}
