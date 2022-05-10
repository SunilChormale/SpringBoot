package com.sunil.basics.beans;

import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
public class MyAnotherBean {

    public MyAnotherBean(){
        System.out.println("This is the object of MyAnotherBean class");
    }

    @Override
    public String toString(){
        return "\nMyAnotherBean class.\n";
    }
}
