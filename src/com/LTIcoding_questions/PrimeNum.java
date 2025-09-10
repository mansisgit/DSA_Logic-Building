package com.LTIcoding_questions;

public class PrimeNum {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n % i ==0) return false;
          return true;

    }

    public static void main(String[] args) {
        System.out.println(isPrime(45));
    }

}
