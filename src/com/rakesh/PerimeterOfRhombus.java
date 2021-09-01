package com.rakesh;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        float side, perimeter;
        Scanner in = new Scanner(System.in);
        System.out.println("give value of on side = ");
        side = in.nextFloat();
        perimeter = 4*side;
        System.out.println("Perimeter Of Rhombus is = " + perimeter);
    }
}
