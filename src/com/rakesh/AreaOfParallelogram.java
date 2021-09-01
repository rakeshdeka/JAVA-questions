package com.rakesh;


import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        float base, height, area;
        Scanner in = new Scanner(System.in);
        System.out.println("what is base = ");
        base = in.nextFloat();
        System.out.println("what is the height");
        height = in.nextFloat();
        area = base*height;
        System.out.println("Area Of Parallelogram is = " + area);


    }
}
