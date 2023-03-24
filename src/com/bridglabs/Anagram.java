package com.bridglabs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter String 1 : ");
        String str1 =sc.next().toLowerCase();
        System.out.println("Enter string 2: ");
        String str2=sc.next().toLowerCase();
        // compare size
        if(str1.length()==str2.length())
        {
            // conver string to array
            char char1[] =str1.toCharArray();
            char char2[] =str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            String sorted1=new String(char1);
            String sorted2=new String(char2);

            if(sorted1.equals(sorted2)){
                System.out.println("String is anagram");
            }
            else
                System.out.println("not anagram");
        }
    }
}
