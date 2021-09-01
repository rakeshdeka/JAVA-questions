package com.rakesh;

import javax.swing.*;
import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {

        Scanner intput = new Scanner(System.in);
        System.out.println("Type the year here");
        int year = intput.nextInt();
        if(((year % 4 == 0) && (year % 100 != 0)) ||
                (year % 400 == 0)){
            System.out.println( year + "leap year");

        }else
        System.out.println(year + "Not a leap year");


    }
}

