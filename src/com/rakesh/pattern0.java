package com.rakesh;

import java.util.Scanner;

public class pattern0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("row");
        int n= in.nextInt();
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                if (col<=row)
                    System.out.print("*");
                else
                    System.out.print("");
                
            }
            System.out.println();
        }
    }
}
