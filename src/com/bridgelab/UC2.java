package com.bridgelab;

public class UC2 {
    public static void main(String[] args) {
        int full_time = 1;
        int emp_per_hr = 20;
        int empHrs = 0;
        int empWage = 0;
        double empdetail = Math.floor(Math.random() * 10) % 2;
        if (empdetail == full_time) {
            empHrs = 8;
        } else {
            empHrs = 0;
        }
        empWage = empHrs * emp_per_hr;
        System.out.println("Employee Wage:" + empWage);
    }
}

