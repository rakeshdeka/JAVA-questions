package com.rakesh;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        System.out.println("befor swap a" + a);
        System.out.println("before swap b " + b);

         a = a+b;
         b= a-b;
         a = a-b;
        System.out.println("after swap a" + a);
        System.out.println("after swap b " + b);
    }
}
