package org.jb.part002;

public class Human {
     private String name;
    private String dob;
    private String ethnicity;
    private Address address;

    public Human() {
    }

    public Human(String name, String dob, String ethnicity, Address address) {
        this.name = name;
        this.dob = dob;
        this.ethnicity = ethnicity;
        this.address = address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printAddress() {
         System.out.println(address.toString());
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", address=" + address +
                '}';
    }
}
