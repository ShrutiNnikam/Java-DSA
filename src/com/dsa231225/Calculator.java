package com.dsa231225;

import java.util.Scanner;
// take input from user till user insert x or X
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator:");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two nums:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num2 - num1;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0)
                        ans = num2 / num1;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }else if(op == 'x' || op == 'X'){
                 break;
                }else{
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }


    }
}
