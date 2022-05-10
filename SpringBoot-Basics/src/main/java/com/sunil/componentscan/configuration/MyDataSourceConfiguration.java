package com.sunil.componentscan.configuration;

import com.sunil.componentscan.beans.MyDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyDataSourceConfiguration {

    @Bean
    public MyDataSource getMyDataSourceConnection(){
        return new MyDataSource();
    }
}
