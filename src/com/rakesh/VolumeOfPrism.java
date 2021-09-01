package com.rakesh;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        float base, height, volume;
        Scanner in = new Scanner(System.in);
        System.out.println("base of the prism = ");
        base = in.nextFloat();
        System.out.println("height of the prism");
        height = in.nextFloat();
        volume = base*height;
        System.out.println("Volume Of Prism is = " + volume);
    }

}
