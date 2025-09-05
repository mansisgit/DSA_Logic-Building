package com.LTIcoding_questions;

import java.util.Scanner;

public class Max_in_array {

    public static int findMax(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        int maxVal = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele>maxVal){
                maxVal = ele;
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMax(arr));
        sc.close();
    }
}
