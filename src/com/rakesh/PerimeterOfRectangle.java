package com.rakesh;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        float length, width, perimeter;
        Scanner in = new Scanner(System.in);
        System.out.println("Length of the Rectangle = ");
        length = in.nextFloat();
        System.out.println("Width of the Rectangle = ");
        width = in.nextFloat();
        perimeter = 2*(length+width);
        System.out.println("Perimeter Of Rectangle is = " + perimeter);


    }
}
