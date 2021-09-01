package com.rakesh;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        float length, width;
        Scanner in = new Scanner(System.in);
        System.out.print("What is the Length = ");
        length = in.nextFloat();
        System.out.print("What is the width = ");
        width = in.nextFloat();
                float area = width*length;
        System.out.println("area of the rectangle = " + area);
    }
}
