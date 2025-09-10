package com.LTIcoding_questions;

import java.util.Arrays;

public class Anagram_Size {

    public  static boolean anotherOptimized(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        int[] count = new int[256];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int c : count)
            if(c != 0) return false;
        return true;
    }
    public static boolean areAnagrams(String s1, String s2){
        char[] a = s1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] b = s2.replaceAll("\\s","").toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }

    static void printBinarySizes(String s1, String s2){
        System.out.println(Integer.toBinaryString(s1.length()));
        System.out.println(Integer.toBinaryString(s2.length()));
    }

    //same class mein hai main
    public static void main(String[] args) {
        String s1 = "mannalih";
        String s2 = "channa";
        System.out.println(areAnagrams(s1,s2));
        printBinarySizes(s1,s2);
        System.out.println(anotherOptimized(s1,s2));
    }

}
