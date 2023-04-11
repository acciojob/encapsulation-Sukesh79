package com.driver;

public class RWOnly {
    String name;
    RWOnly(String name){
        this.name = name;
        System.out.println(name);
    }

    public String getter() {
        return name;
    }

    public void setter(String name) {
        this.name = name;
    }
}
