package com.driver;

public class RWOnly {
    private String name;
    RWOnly(){ }

    public String getter() {
        return name;
    }

    public void setter(String name) {
        this.name = name;
    }
}
