package org.jb.part005;

public class CPU {
    private String gen;
    private int noOfCore;

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setNoOfCore(int noOfCore) {
        this.noOfCore = noOfCore;
    }

    public void cpuRunning() {
        System.out.println("CPU is running!");
    }
}
