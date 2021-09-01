package com.rakesh;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {

        float radius;
        Scanner in = new Scanner(System.in);
        System.out.println("Radius of the sphere = ");
        radius = in.nextFloat();
        Double pie=3.14285714286;

        double volume =  (4.0/3.0)*pie*(radius*radius*radius);
        System.out.println(volume);
    }
}
