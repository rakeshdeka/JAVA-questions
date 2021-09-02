package com.rakesh;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        float radius, height;
        Scanner in = new Scanner(System.in);
        System.out.println("Radius of the cone = ");
        radius = in.nextFloat();
        System.out.println("Height of the cone = ");
        height = in.nextFloat();
        Double pie=3.14285714286;
        float volume = (float) ((pie * (radius * radius) * height) / 3);
        System.out.println("Volume Of Cone = " + volume);
    }
}
