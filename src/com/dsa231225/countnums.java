package com.dsa231225;

import java.util.Scanner;

public class countnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int count = 0;

        while(n > 0){
            int rem = n%10;
            if(rem ==m){
            count++;
        }
            n= n/10;
    }
        System.out.println(count);
}}
