package com.rakesh;

//import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("row =");
//        int n = in.nextInt();
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (col>=6-row)
                    System.out.print("*");
                else
                    System.out.print("");

            }
            System.out.println();
        }
    }
}
