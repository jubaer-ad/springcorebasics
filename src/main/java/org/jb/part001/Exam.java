package org.jb.part001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        // Starter

        ApplicationContext context = new ClassPathXmlApplicationContext("beanPart001.xml");

        // DI using setter
        Student s1 = context.getBean("s1", Student.class);
        System.out.println(s1.toString());

        // DI using constructor
        Student s2 = context.getBean("s2", Student.class);
        System.out.println(s2.toString());

        Student s3 = context.getBean("s3", Student.class);
        System.out.println(s3.toString());

        Student s4 = context.getBean("s4", Student.class);
        System.out.println(s4.toString());
    }
}
