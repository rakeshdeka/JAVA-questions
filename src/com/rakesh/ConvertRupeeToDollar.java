package com.rakesh;

import java.util.Scanner;

public class ConvertRupeeToDollar {
    public static void main(String[] args) {
        float rupee, dollar;
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter rupees:");
        rupee= sc.nextFloat();
        dollar=rupee/74;
        System.out.println(" after converting to dollar is" + dollar);
    }
}
