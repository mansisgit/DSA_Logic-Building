package com.LTIcoding_questions;

public class Special_to_Front {
    public static String specialToFront(String s){
        StringBuilder special = new StringBuilder();
        StringBuilder normal = new StringBuilder();

        for(char c : s.toCharArray()){
            if (!Character.isLetterOrDigit(c)) special.append(c);
            else normal.append(c);
        }
        return special.append(normal).toString();//builder-->string
    }

}
