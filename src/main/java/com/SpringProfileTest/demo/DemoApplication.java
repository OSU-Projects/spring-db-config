package com.SpringProfileTest.demo;

import com.SpringProfileTest.demo.beans.myDataSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	/**READ ME
	 *  Priorities high to low
	 *
	 *  command line argument should be --spring.profiles.active=dev
	 *  environment variables should be  SPRING_PROFILES_ACTIVE:qa
	 *	application.properties
	 *	configuration files
	 *  and also in myDataSource file we can declare the properties file path if it not y default one
	 *  by @PropertySource("classpath:")
	 *
	 * */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

	myDataSource myDataSourceObj = new myDataSource();
		System.out.println("my Data source obj :: "+myDataSourceObj.getUsername());

	}
}
