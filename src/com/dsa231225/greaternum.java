package com.dsa231225;

import java.util.Scanner;

public class greaternum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(b>max){
            System.out.println(b);
        }
        if(c>max){
            System.out.println(c);
        }
    }
}
