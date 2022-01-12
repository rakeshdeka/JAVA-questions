package com.rakesh;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,rem,rev=0;
        System.out.println("enter the no");
        x = in.nextInt();
        y=x;
        while(x!=0)
        {

            rem= x%10;
            rev=rev*10+rem;
            x= x/10;

        }
        if(y==rev)

            System.out.println("palindrome");
        else
            System.out.println("not an palindrome");
    }
}
