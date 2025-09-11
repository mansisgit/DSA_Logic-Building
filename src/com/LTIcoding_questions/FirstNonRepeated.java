package com.LTIcoding_questions;

public class FirstNonRepeated {

    public static Character uniqueChar(String s){
        int[] chars = new int[256];
        for(char c :s.toCharArray()) chars[c]++;
        for(char c: s.toCharArray()) {
            if (chars[c] == 1) return c;
        }
        return null;
    }

    public static void main(String[] args) {
        String s = "abbccdd";
        String s1 = "aabb";
        System.out.println(uniqueChar(s));
        System.out.println(uniqueChar(s1));

    }
}
