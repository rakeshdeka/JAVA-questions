package com.rakesh;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("enter two number");
        int firstnumber, secondnumber, sum;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number= ");
        firstnumber = sc.nextInt();
        System.out.print("Enter second number= ");
        secondnumber = sc.nextInt();
        sum= secondnumber + firstnumber;
        System.out.print("Sum of two number ="+ sum);


    }
}
