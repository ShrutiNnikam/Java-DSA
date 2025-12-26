package com.dsa231225;

import java.util.Scanner;

public class LCM {
   private static int gcd(int a, int b){
       while(b!=0){
           int temp =b;
           b = a % b;
           a = temp;

       }
       return a;
   }
   private static int lcm(int a, int b){
       return (a*b) / gcd(a,b);
   }
   private static int FindLCM(int[] arr){
       int result = arr[0];
       for(int i =1; i< arr.length; i++){
           result = lcm(result, arr[i]);
       }
       return result;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of arrays:");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int result = FindLCM(arr);
        System.out.println("lcm of array:"+result);
    }
}
