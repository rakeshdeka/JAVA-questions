package com.rakesh;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int max = Math.max(d, Math.max(c, Math.max(a,b)));
        System.out.println(max);




    }
}
