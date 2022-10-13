package org.jb.part003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part3Driver {
    public static void main(String[] args) {
        // Dependency Injection 002


        ApplicationContext context = new ClassPathXmlApplicationContext("beanPart003.xml");
//        Child boy001 = context.getBean("boy001", Boy.class);
//        boy001.display();
//        Child girl001 = context.getBean("girl001", Girl.class);
//        girl001.display();

        Offspring offspring001 = context.getBean("offspring", Offspring.class);
        offspring001.display();

    }
}
