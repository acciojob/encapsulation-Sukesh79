package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly rw = new RWOnly("Sukesh");
        rw.setName("Sukesh Reddy");
        System.out.println(rw.getName());
    }
}