package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Fruit myFruit = new Fruit();
		// Vegetable myVegetable = new Vegetable();
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		Vegetable myVegetable = (Vegetable) appContext.getBean("vegetable");
		System.out.println(myVegetable.talkMeAboutYourself());

		Fruit myOtherFruit = appContext.getBean("fruitWithListAndMap", Fruit.class);
		System.out.println(myOtherFruit.talkMeAboutYourself());

		Vegetable myOtherVegetable = (Vegetable) appContext.getBean("vegetableName");
		System.out.println(myOtherVegetable.talkMeAboutYourself());

		Vegetable vegWithPNamespace = appContext.getBean("vegUsingPNamespace", Vegetable.class);
		System.out.println(vegWithPNamespace.talkMeAboutYourself());
		
		Vegetable externalVeg = appContext.getBean("externalVeg",Vegetable.class);
		System.out.println(externalVeg.talkMeAboutYourself());
		
		Vegetable vegLife = appContext.getBean("vegetableLife",Vegetable.class);
		System.out.println(vegLife.talkMeAboutYourself());
		
		((FileSystemXmlApplicationContext) appContext).close();
	}
}
