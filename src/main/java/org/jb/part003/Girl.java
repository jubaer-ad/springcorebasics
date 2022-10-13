package org.jb.part003;

public class Girl implements Child{
    private String name;
    private Parent mother;
    private Parent father;

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMother(Parent mother) {
        this.mother = mother;
    }

    public void setFather(Parent father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", mother=" + mother.display() +
                ", father=" + father.display() +
                '}';
    }
}
