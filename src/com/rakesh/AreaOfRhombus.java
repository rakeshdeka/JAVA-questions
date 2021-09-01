package com.rakesh;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        float diagonal1, diagonal2, area;
        Scanner in = new Scanner(System.in);
        System.out.println("first diagonal");
        diagonal1 = in.nextFloat();
        System.out.println("second diagonal");
        diagonal2 = in.nextFloat();
        area = diagonal1*diagonal2/2;
        System.out.println("area of a rhombus = "+ area);
    }
}
