package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
       // obj.name = "chetan";
        obj.setName("chetan");
        obj.getName();
    }
}