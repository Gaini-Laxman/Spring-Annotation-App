package com.klinnovations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klinnovations.config.AppConfig;

public class App {
	
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//context.getBean(Car.class);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
