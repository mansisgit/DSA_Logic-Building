package com.LTIcoding_questions;

public class Palindrom_num_word {
    public static void main(String[] args) {
        String s = "naman";
        int n = 27879333;
        System.out.println(isPalindromNum(n));
        System.out.println(isPalindromStr(s));
    }

    static boolean isPalindromNum(int n){
        int orig = n , rev =0;
        while (n>0){
            rev = rev*10+n%2;
            n/=10;
        }
        return orig==rev;
    }

    static boolean isPalindromStr(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
