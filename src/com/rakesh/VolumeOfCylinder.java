package com.rakesh;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        int radius, height;
        Scanner in = new Scanner(System.in);
        System.out.println("radius of the cylinder");
        radius = in.nextInt();
        System.out.println("height of the cylinder");
        height = in.nextInt();
        double pie= 3.14285714286;;
        double volume = pie*(radius*radius)*height;
        System.out.println("Volume Of Cylinder is = " + volume);
    }
}
