package com.rakesh;

import java.util.Scanner;

public class EqualityOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a number");
        a= in.nextInt();
        System.out.println("Enter a number");
        b= in.nextInt();
        if (a == b) {
            System.out.println("numbers are equal");
        }else
        {
            System.out.println("numbers are not equal");
        }
    }
}
