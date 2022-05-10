package com.sunil.basics;

import com.sunil.basics.configuration.MyBeanConfiguration;
import com.sunil.componentscan.configuration.MyDataSourceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sunil.basics.beans.MyBean;
import com.sunil.basics.beans.MyAnotherBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
//So this component scan is by default with no argument in it, but it always scans the package it is declared
// here @ComponentScan is equivalent to @ComponentScan("com.sunil.basics")
// Also we can change this default or base package like this
//@ComponentScan(basePackages = "com.sunil.componentscan" )
@ComponentScan({"com.sunil.basics","com.sunil.componentscan"})
public class Basics {

    public static void main(String[] args) {
        // Now we have created the Beans now so
        // How to get them using, so we are going to get them from application context

        // here we have created the object of Application context from the annotation config as we are using that only
        //AnnotationConfigApplicationContext acap = new AnnotationConfigApplicationContext();
        // here we need to register our configuration class and i.e. MyBeanConfiguration class
        //acap.register(MyBeanConfiguration.class);
        //acap.register(MyDataSourceConfiguration.class);
        // so let's just refresh the context here
        //acap.refresh();

        // Here we are getting the object from the application context and just printing them
        //MyBean first = acap.getBean(MyBean.class);
        //MyAnotherBean second = acap.getBean(MyAnotherBean.class);

        //System.out.println(first.toString());
        //System.out.println(second.toString());

        SpringApplication.run(Basics.class,args);
    }

}
