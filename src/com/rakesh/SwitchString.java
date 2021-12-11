package com.rakesh;

public class SwitchString {
    public static void main(String[] args) {
        String r= "pqr";

        switch(r)
        {
            case "abc":
                System.out.println("abc");
                break;
            case "bca" :
                System.out.println("bca");
                break;
            case "kca" :
                System.out.println("kca");
                break;
            case "pqr" :
                System.out.println("pqr");
                break;

            default:
                System.out.println("no match");
        }
    }
}
