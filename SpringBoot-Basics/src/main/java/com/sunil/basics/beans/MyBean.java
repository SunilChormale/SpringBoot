package com.sunil.basics.beans;

public class MyBean {

    /**
     * Bean is the Object of the class that is stored into the Application Context
     * They are created into the @Configuration annotated class having Bean method with @Bean annotation
     */


    public MyBean(){
        System.out.println("Bean has been created for MyBean Class.");
    }

    @Override
    public String toString(){
        return "\nMyBean class.\n";
    }
}


