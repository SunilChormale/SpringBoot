package com.sunil.basics.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sunil.basics.beans.MyBean;
import com.sunil.basics.beans.MyAnotherBean;

// This annotation means that we have @Bean is used in the class
// and @Configuration is used for the creating beans and to add them to ApplicationContext
// If we remove this annotation from the class though the beans will be created but they will be
// created with bean " lite mode ".
@Configuration
public class MyBeanConfiguration {

    // So this annotation will create a Bean of MyBean class (means it will create the object of that
    // class and adds it to ApplicationContext)
    // Here default name of the bean is method name i.e. createMyBean if you want to change it then you can change it
    // Creating shared instance of singleton bean 'createMyBean'
    // this means that it will create the instance of MyBean throughout the application context only once till you shut down or restart the server
    // so by default scope of @Bean is "singleton"
    @Bean
    public MyBean createMyBean(){
        return new MyBean(); // These objects are always returned to the ApplicationContext
    }

    @Bean
    public MyAnotherBean createMyAnotherBean(){
        // here you can configure your bean means like having a database connection and all of those stuff
        return new MyAnotherBean();// This object will be returned to the application context
    }

}
