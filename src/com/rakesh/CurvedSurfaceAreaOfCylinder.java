package com.rakesh;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        float radius;
        float height;
        double curvedSurfaceArea;
        Scanner in = new Scanner(System.in);
        System.out.println(" Radius of the base cylinder is = ");
        radius = in.nextFloat();
        System.out.println("Height of the cylinder = ");
        height = in.nextFloat();
        Double pie=3.14285714286;
        curvedSurfaceArea = 2*pie*(radius*height);// formula= 2pie*rh
        System.out.println("The curved surface area of cylinder is = "+ curvedSurfaceArea);
    }
}
