package org.jb.part001;

//@Data
public class Student {

    private int id;
    private String name;

    public Student() {
        System.out.println("No cons-param called: ");
    }

    public Student(int id) {
        System.out.println("Single cons-param called: " + id);
        this.id = id;
    }

    public Student(int id, String name) {
        System.out.println("All cons-param called: " + id + " : " + name);
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
