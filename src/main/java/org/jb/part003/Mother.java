package org.jb.part003;

public class Mother implements Parent{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mother{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String display() {
        return toString();
    }
}
