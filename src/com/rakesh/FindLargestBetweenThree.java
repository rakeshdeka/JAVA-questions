package com.rakesh;

import java.util.Scanner;

public class FindLargestBetweenThree {
    public static void main(String[] args) {
        int firstnumber, secondnumber, thirdnumber, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number= ");
        firstnumber = sc.nextInt();
        System.out.print("Enter the second number= ");
        secondnumber = sc.nextInt();
        System.out.print("Enter the third number= ");
        thirdnumber = sc.nextInt();
        if (firstnumber>secondnumber){
            if(thirdnumber>firstnumber)
            System.out.print("The Largest number is= " + thirdnumber);
            else
                System.out.print("The Largest number is= " + firstnumber);
        }else
        {
            if (secondnumber>thirdnumber)
                System.out.print("The Largest number is= " + secondnumber);
            else
                System.out.print("The Largest number is= " + thirdnumber);
        }



    }
    }


