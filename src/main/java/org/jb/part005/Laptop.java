package org.jb.part005;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {
//    @Autowired
    CPU cpu;
    int val;

//    @Autowired
    public Laptop() {
        System.out.println("In empty arg cons");
    }

    @Autowired
    public Laptop(CPU cpu) {
        System.out.println("In all arg cons");
        this.cpu = cpu;
        this.val = 0;
    }

    @Autowired
    public void setCpu(CPU cpu) {
        System.out.println("In setCpu method");
        this.cpu = cpu;
        this.val = 1;
    }

    public void laptopCore() {
        if (cpu != null) {
            cpu.cpuRunning();
        }
        else
            System.out.println("No CPU found!");
    }
}
