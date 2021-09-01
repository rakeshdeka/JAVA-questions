package com.rakesh;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        float  base, height, area;
        Scanner in = new Scanner(System.in);
        System.out.println("what is the base");
        base = in.nextFloat();
        System.out.println("what is the height");
        height= in.nextFloat();
        area = (base*height)/2;
        System.out.println("ares of the Isosceles Triangle is " + area);

    }
}
