package com.rakesh;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,rem,sum=0;
        System.out.println("enter the no");
        x = in.nextInt();

        while(x!=0)
        {

            rem= x%10;
            sum=sum+rem;
            x= x/10;

        }


        System.out.println("sum of digits" +  sum);
    }
}
