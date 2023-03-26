package com.bridglabs.DSA_PrimeNumQueue;

public class Extend_PrimeNumberRange_Queue {
    Queue<Integer>queue= new Queue<>();
    static int num=0;
    void prime() {
        System.out.println("Printing prime numbers which is Anagram between 0-1000 ");
        for (int i = 2; i < 1000; i++) {
            num = i;
            print();
        }
    }
    void print(){

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            int a=num;
            int rev = 0;
            while (a!=0) {
                int last = a % 10;
                rev = rev * 10 + last;
                a = a / 10;
            }
            if(rev==num) {
                queue.add(num);
            }
        }

    }
    void display(){
        queue.display();
    }
    public static void main(String[] args) {
        Extend_PrimeNumberRange_Queue primeNumberRange = new Extend_PrimeNumberRange_Queue();
        primeNumberRange.prime();
        primeNumberRange.display();
    }
}
