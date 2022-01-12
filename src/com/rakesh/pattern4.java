package com.rakesh;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows");
        int n= in.nextInt();
        for (int row = 1; row<=n ; row++) {
            for (int col = 1;  col<=row; col++) {
                System.out.print( col + " ");

            }
            System.out.println();
        }
    }
}
