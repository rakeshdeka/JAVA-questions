package com.rakesh;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        float base, slide, perimeter;
        Scanner in = new Scanner(System.in);
        System.out.print("base of triangle = ");
        base = in.nextFloat();
        System.out.print("base of triangle = ");
        slide = in.nextFloat();
        perimeter = 2*(base+slide);
        System.out.print("Perimeter Of Parallelogram = " + perimeter);
    }
}
