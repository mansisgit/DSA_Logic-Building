package com.LTIcoding_questions;

public class Second_Largest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,9};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr){
        int first = Integer.MIN_VALUE,second = Integer.MAX_VALUE;
        for(int x: arr){
            if(x>first){
                second=first;
                first=x;
            }else if(x>second && x != first){
                second = x;
            }
        }
        return second;
    }
}
