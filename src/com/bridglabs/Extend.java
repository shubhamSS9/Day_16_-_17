package com.bridglabs;

public class Extend {
    static int num1=0;
    void NumberGenerator() {
        for (int i = 0; i < 1000; i++) {
            num1 = i;
            print();
        }
    }
    void print() {
        boolean flag = false;
        for (int i = 2; i <= num1 / 2; ++i) {
            if (num1 % i == 0) {
                flag = true;
                break;
            }
        }/// prime number logic end

// palindrome checker
        int a=num1;
        int rev = 0;
        while (a!=0) {
            int last = a % 10;
            rev = rev * 10 + last;
            a = a / 10;
        }
        //printing
        if(rev==num1)
        {
            if (!flag) {
                System.out.println(num1+" is a prime number & palindrome");
            }
        }
    }

    public static void main(String[] args) {
        Extend extend = new Extend();
        extend.NumberGenerator();

    }
}
