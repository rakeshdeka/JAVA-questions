package com.rakesh;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int firstno;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number= ");
        firstno = sc.nextInt();
        if (firstno%2==0)
            System.out.print(firstno + " is even number");
        else
            System.out.print(firstno + " is odd number");

    }
}
