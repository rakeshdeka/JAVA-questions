package com.rakesh;

import java.util.Scanner;

public class amstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,rem,sum=0;
        System.out.println("enter the no");
        x = in.nextInt();
        y=x;
        while(x!=0)
        {

            rem= x%10;
            sum=sum+(rem*rem*rem);
            x= x/10;

        }
    if(y==sum)

        System.out.println("amstrong");
    else
        System.out.println("not an amstrong");
    }
}
