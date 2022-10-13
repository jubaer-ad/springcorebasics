package org.jb.part007;

import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
    public Department() {
        System.out.println("Department no arg const called!");
    }
}
