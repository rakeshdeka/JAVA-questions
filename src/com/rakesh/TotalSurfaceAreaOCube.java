package com.rakesh;

import java.util.Scanner;

public class TotalSurfaceAreaOCube {
    public static void main(String[] args) {
        float sideLength, totalArea;
        Scanner in = new Scanner(System.in);
        System.out.println("give value of one side = ");
        sideLength = in.nextFloat();
        totalArea = 6*(sideLength*sideLength);
        System.out.println("Total surface area of cube is = " + totalArea);
    }
}
