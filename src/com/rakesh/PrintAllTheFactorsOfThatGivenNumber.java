package com.rakesh;

import java.util.Scanner;

public class PrintAllTheFactorsOfThatGivenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num ;
        System.out.print(" Enter the number ");
        num= in.nextInt();
        System.out.println("factors of " + num + " are: "  );
        for (int i = 1; num >= i; i++) {
        if (num%i==0)
            System.out.print(i+ " ");

        }

    }
}
