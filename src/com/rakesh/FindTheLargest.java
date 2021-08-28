package com.rakesh;

import java.util.Scanner;

public class FindTheLargest {
    public static void main(String[] args) {
        int firstnumber, secondnumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first no= ");
        firstnumber= sc.nextInt();
        System.out.print("Enter the second no= ");
        secondnumber= sc.nextInt();
        if(firstnumber>secondnumber){
            System.out.print("The largest number is =" + firstnumber);
        }else{
            System.out.print("The largest number is =" + secondnumber);
        }
    }
}
