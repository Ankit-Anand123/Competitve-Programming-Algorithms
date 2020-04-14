package com.competitiveprogramming.algebra.fundamentals;

import java.util.Scanner;

public class BinaryExponentiation {

    static long findPower(long a, long b){
        if(b==0)
            return 1;
        long res = findPower(a, b/2);
        if(b%2 == 0)
            return res*res;
        else {
            if(b>0)
                return a*res*res;
            else
                return (res*res)/a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(findPower(a,b));
    }
}
