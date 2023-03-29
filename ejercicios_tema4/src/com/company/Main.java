package com.company;

public class Main {
    public static void main(String[] args) {

        SmartDevice smartPhone = new SmartPhone("Apple", "iPhone 14", 15000d, 64, 4);

        SmartDevice smartWatch = new SmartWatch("Apple", "Apple Watch", 7000d, "redondo", true);

        System.out.println(smartPhone);
        System.out.println(smartWatch);


    }
}
