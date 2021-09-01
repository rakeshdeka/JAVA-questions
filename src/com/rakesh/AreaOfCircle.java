package com.rakesh;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        float a, r;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle= ");
        r= in.nextFloat();
        a= 3.14f*r*r;
        System.out.println(a);

    }
}
