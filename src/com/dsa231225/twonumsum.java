package com.dsa231225;

import java.util.Scanner;

public class twonumsum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st num:");
//        int n1 = sc.nextInt();
//        System.out.println("Enter 2nd num:");
//        int n2 = sc.nextInt();
//
//        int sum = n1 + n2;
//        System.out.println("the sum of no is:" +sum);
//
//    }

/*
 called the sum many times
     return_type name(arguments){
     body
    return statement
    }

 */

public static void main(String[] args) {
 sum();
 sum();
}

static void sum(){
  Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1st num:");
      int n1 = sc.nextInt();
      System.out.println("Enter 2nd num:");
      int n2 = sc.nextInt();

       int sum = n1 + n2;
       System.out.println("the sum of no is:" +sum);

}

}