package com.rakesh;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        float base, height, area;
        Scanner in = new Scanner(System.in);
        System.out.println("What is the base= ");
        base = in.nextFloat();
        System.out.println("What is the height");
        height = in.nextFloat();
        area= (base*height)/2;
        System.out.println(area);
    }
}
