package org.jb.part005;

import org.jb.part006.CollectionTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part5Driver {
    public static void main(String[] args) {
        // AutoWiring

        ApplicationContext context = new ClassPathXmlApplicationContext("beanPart005.xml");

        Laptop laptop001 = context.getBean("laptop", Laptop.class);
        laptop001.laptopCore();
        System.out.println("val is: " + laptop001.val);
    }
}
