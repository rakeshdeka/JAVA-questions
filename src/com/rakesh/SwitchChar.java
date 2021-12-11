package com.rakesh;

public class SwitchChar {
    public static void main(String[] args) {
        char r= 'e';

        switch(r)
        {
            case 'a':
                System.out.println("monday");
                break;
            case 'b' :
                System.out.println("tuesday");
                break;
            case 'c' :
                System.out.println("wednesday");
                break;
            case 'd' :
                System.out.println("thursday");
                break;
            case 'e' :
                System.out.println("friday");
                break;
            case 'f' :
                System.out.println("saturday");
                break;
            case 'g' :
                System.out.println("sunday");
                break;
                default:
                    System.out.println("no match");
        }
    }
}
