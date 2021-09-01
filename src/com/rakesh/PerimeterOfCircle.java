package com.rakesh;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        float radius, perimeter;
        Scanner in = new Scanner(System.in);
        System.out.print("Radius of the circle= ");
        radius = in.nextFloat();
        perimeter = (float) (2*3.14*radius);
        System.out.print("Perimeter of the Circle = " + perimeter);
    }
}
