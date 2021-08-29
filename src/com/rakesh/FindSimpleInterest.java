package com.rakesh;

import java.util.Scanner;

public class FindSimpleInterest {
    public static void main(String[] args) {
        float p, t, r,si;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the P= ");
        p= sc.nextFloat();
        System.out.print("Enter the T= ");
        t= sc.nextFloat();
        System.out.print("Enter the R= ");
        r= sc.nextFloat();
        si=p*t*r/100;
        System.out.print("simple interest= " + si);

    }
}
