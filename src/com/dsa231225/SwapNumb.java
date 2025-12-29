package com.dsa231225;

import java.util.Scanner;

public class SwapNumb {
    public static void main(String[] args) {
  swap(10, 20);
  swap(30, 45);
    }
        static void swap(int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 2 no:");


        int temp = a;
        a = b;
        b =temp;
            System.out.println(a+" "+b);
    }
}
