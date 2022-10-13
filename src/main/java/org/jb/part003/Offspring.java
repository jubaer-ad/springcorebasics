package org.jb.part003;

public class Offspring {
    Child child;

    public void setChild(Child child) {
        this.child = child;
    }

    public void display() {
        child.display();
    }
}
