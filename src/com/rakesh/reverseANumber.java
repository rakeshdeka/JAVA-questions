package com.rakesh;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,rem,rev=0;
        System.out.println("enter the no");
        x = in.nextInt();

        while(x!=0)
        {

            rem= x%10;
            rev=rev*10+rem;
            x= x/10;

        }


        System.out.println("after reverse" + rev);

    }
}
