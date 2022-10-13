package org.jb.part007;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class Part007Driver {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(OrganizationConfig.class);
        Department dept = context.getBean("dept", Department.class);
        System.out.println(dept);
        Bar bar = context.getBean("b1", Bar.class);
        bar.display();
    }
}
