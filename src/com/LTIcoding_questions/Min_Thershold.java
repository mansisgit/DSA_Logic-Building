package com.LTIcoding_questions;

public class Min_Thershold {

    public static void thresholdCount(String s, int threshold){
        int [] count = new int[256];

        for(char c : s.toCharArray()) count[c]++;

        for(int i =0;i<256;i++){
            if(count[i]>=threshold){
                System.out.println((char) i + ":"+count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "apple and banaana";
        int thr = 3;
        thresholdCount(s,thr);
    }

}
