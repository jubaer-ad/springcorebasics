package org.jb.part003;

public class Father implements Parent{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String display() {
        return toString();
    }
}
