package com.LTIcoding_questions;

import java.util.Arrays;
import java.util.Comparator;

public class Sort_by_Length {
    public static void main(String[] args) {
        String[] s = {"hiee","purshd","hsdhffyiud"};
        System.out.println(Arrays.toString(shortFirst(s)));
    }

    public static String[] shortFirst(String[] s){
        Arrays.sort(s, Comparator.comparingInt(String::length));
        return s;
    }
}
