package com.dsa231225;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = 0;
      int b=1;
      int c =0;
      int count =2;
//
//        while(count <= n){
//            int temp =b;
//            b = b + a;
//            a = temp ;
//            count++;
//        }
//        System.out.println(b);
        while( count <= n){
         c = a + b;
           a=b;
            b=c;
            count++;
        }
        System.out.println(c);
    }
}
