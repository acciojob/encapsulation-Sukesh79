package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly rw = new RWOnly("Sukesh");
        rw.setter("Sukesh Reddy");
        String name = rw.getter();
        System.out.println(name);
    }
}