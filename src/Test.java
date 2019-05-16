package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring.renderer.MessageRenderer;

public class Test
{
	public static void main(String[] args)
	{					
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		MessageRenderer renderer = (MessageRenderer) context.getBean("ren"); 
		renderer.render();
	}
}