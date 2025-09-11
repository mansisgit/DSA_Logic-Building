package com.LTIcoding_questions;

public class Find_missing_Number_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int till = 8;
        System.out.println(missing(arr,8));
    }

    public static int missing(int[] arr,int till){
        int sum = till*(till+1)/2;
        for(int num : arr) sum-=num;
        return sum;
    }
}
