package org.jb.part004;

public class Sim {
    Service service;

    public void setService(Service service) {
        this.service = service;
    }
    public void display() {
        service.serving();
    }
}
