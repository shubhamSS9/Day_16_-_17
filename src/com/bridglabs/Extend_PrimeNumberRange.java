package com.bridglabs;

public class Extend_PrimeNumberRange {
    static int num=0;
    int[][] primeNumber = new int[10][25];
    static int start ,start1,start2,start3,start4,start5,start6,start7,start8,start9=0;
    void insert0_100(){
        if(num<=100)
        {
            primeNumber[0][start]=num;
            start++;
        }
    }
    void insert101_200(){
        primeNumber[1][start1]=num;
        start1++;
    }
    void insert201_300(){
        primeNumber[2][start2]=num;
        start2++;

    }
    void insert301_400(){
        primeNumber[3][start3]=num;
        start3++;
    }
    void insert401_500(){
        primeNumber[4][start4]=num;
        start4++;
    }
    void insert501_600(){
        primeNumber[5][start5]=num;
        start5++;
    }
    void insert601_700(){
        primeNumber[6][start6]=num;
        start6++;
    }
    void insert701_800(){
        primeNumber[7][start7]=num;
        start7++;
    }
    void insert801_900(){
        primeNumber[8][start8]=num;
        start8++;
    }
    void insert901_1000(){
        primeNumber[9][start9]=num;
        start9++;
    }

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
                if (num <= 99) {
                    insert0_100();
                } else if (num > 100 && num <= 200) {
                    insert101_200();
                } else if (num >= 201 && num <= 300) {
                    insert201_300();
                } else if (num >= 301 && num <= 400) {
                    insert301_400();
                } else if (num >= 401 && num <= 500) {
                    insert401_500();
                } else if (num >= 501 && num <= 600) {
                    insert501_600();
                } else if (num >= 601 && num <= 700) {
                    insert601_700();
                } else if (num >= 701 && num <= 800) {
                    insert701_800();
                } else if (num >= 801 && num <= 900) {
                    insert801_900();
                } else if (num >= 901 && num <= 1000) {
                    insert901_1000();
                }
            }
        }

    }
    void display(){
        for(int i =0;i< primeNumber.length;i++)
        {
            System.out.println("\n");
            System.out.print("Range " + (i+1) + " (");
            System.out.print((i*100) + " - " + ((i+1)*100-1) + "): ");
            for(int j =0;j<7;j++)
            {
                System.out.print(primeNumber[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Extend_PrimeNumberRange primeNumberRange = new Extend_PrimeNumberRange();
        primeNumberRange.prime();
        primeNumberRange.display();
    }
}
