package com.rakesh;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        float slide , perimeter;
        Scanner in = new Scanner(System.in);
        System.out.println("One slide of triangle = ");
        slide = in.nextFloat();
        perimeter = 3*slide;
        System.out.println("Perimeter Of Equilateral Triangle is = " + perimeter);
    }
}
