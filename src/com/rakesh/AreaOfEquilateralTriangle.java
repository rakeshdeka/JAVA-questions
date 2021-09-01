package com.rakesh;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        float side, area;
        Scanner in = new Scanner(System.in);
        System.out.println("give one side of the equilateral triangle = ");
        side = in.nextFloat();
        area = (float) ((1.73*side*side)/4);
        System.out.println(area);

    }
}
