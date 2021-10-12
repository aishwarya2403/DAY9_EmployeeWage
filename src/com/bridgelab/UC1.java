package com.bridgelab;

public class UC1 {
    public static void main(String[] args) {
        int full_time = 1;
        double empDetail = Math.floor(Math.random() * 10) % 2;
        if (empDetail == full_time) {
            System.out.println("**Employee is PRESENT**");
        } else {
            System.out.println("**Employee is ABSENT**");
        }
    }
}
