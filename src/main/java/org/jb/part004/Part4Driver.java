package org.jb.part004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Part4Driver {
    public static void main(String[] args) {
        // Loose Coupling

        ApplicationContext context = new ClassPathXmlApplicationContext("beanPart004.xml");

        Sim sim = context.getBean("sim001", Sim.class);
        sim.display();
    }

}
