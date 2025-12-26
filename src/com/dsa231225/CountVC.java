package com.dsa231225;

import java.util.Scanner;

public class CountVC {
    private static int vowels=0;
    private static int consonants= 0;
    private static void countvc(String str, int i){
        if(i == str.length())
            return;
        char ch = Character.toLowerCase(str.charAt(i));
        if(ch >= 'a' || ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else
                consonants++;
        }
        countvc(str, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here:");
        String str = sc.nextLine();
        countvc(str,0);
        System.out.println("vowels=" +vowels);
        System.out.println("consonants="+consonants);
    }

}
