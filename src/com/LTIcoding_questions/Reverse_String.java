package com.LTIcoding_questions;

public class Reverse_String {

    public static String revString(String s){
        String[] words = s.split(" ");
        StringBuilder rev = new StringBuilder();

        for(String word : words){
            //new String for reverse word and then append it
            rev.append(new StringBuilder(word).reverse());
            rev.append(" ");
        }

        return rev.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Mansi Chate";
        System.out.println(revString(s));
    }
}
