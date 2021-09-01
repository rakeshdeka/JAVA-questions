package com.rakesh;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        double baseLength, baseWidth, pyramidHeight;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base length");
        baseLength = in.nextDouble();
        System.out.println("Enter the base width");
        baseWidth = in.nextDouble();
        System.out.println("Enter the pyramid height");
        pyramidHeight = in.nextDouble();
        double volume = (baseLength * baseWidth * pyramidHeight) / 3;
        System.out.println("Volume of Right rectangular pyramid = " + volume);


    }
}
