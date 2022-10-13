package org.jb.part002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Dependency Injection 001

        System.out.println("Hello world!");

        // Traditional way of DI
        /*Human human = new Human();
        Address address = new Address("34/a", "19/u", "Birlpow");
        human.setAddress(address);
        human.printAddress();*/


        // IOC way of DI
        Human human;
        ApplicationContext context = new ClassPathXmlApplicationContext("beanPart002.xml");
        human = context.getBean("hum001", Human.class);
        System.out.println(human.toString());
        human = context.getBean("testHum002", Human.class);
        System.out.println(human.toString());
        human = context.getBean("testHum003", Human.class);
        System.out.println(human.toString());
        human = context.getBean("testHum004", Human.class);
        System.out.println(human.toString());

    }
}