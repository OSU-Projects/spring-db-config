package com.SpringProfileTest.demo;


import com.SpringProfileTest.demo.beans.myDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mydatasource.properties")
public class MyConfiguration {

    //this is my data source bean
    @Bean
    public myDataSource myDataSource(@Value("${mydatasource.username}") String username,
                                     @Value("${mydatasource.password}") String password){

        myDataSource myDataSourceObj = new myDataSource();
        myDataSourceObj.setUsername(username);
        myDataSourceObj.setPassword(password);

        System.out.println("data source username :: "+myDataSourceObj.getUsername()+"  passwd :: "+myDataSourceObj.getPassword());

        return myDataSourceObj;
    }

}
