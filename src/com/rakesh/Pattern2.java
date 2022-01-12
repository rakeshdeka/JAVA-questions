package com.rakesh;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the row no");
        int n = in.nextInt();
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");

            }
            System.out.println( );
        }

    }
}
