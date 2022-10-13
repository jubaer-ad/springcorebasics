package org.jb.part002;

public class Address {
    private String holding;
    private String road;
    private String zilla;

    public Address() {
    }

    public Address(String holding, String road, String zilla) {
        this.holding = holding;
        this.road = road;
        this.zilla = zilla;
    }

    public void setHolding(String holding) {
        this.holding = holding;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public void setZilla(String zilla) {
        this.zilla = zilla;
    }

    @Override
    public String toString() {
        return "Address{" +
                "holding='" + holding + '\'' +
                ", road='" + road + '\'' +
                ", zilla='" + zilla + '\'' +
                '}';
    }
}
