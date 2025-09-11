package com.LTIcoding_questions;

import java.util.Stack;

public class Balanced_Parentheses {

    public static boolean isBalanced(String s){

        Stack<Character> parantheses = new Stack<>();

        for(char c : s.toCharArray()){
            if(c =='[' || c == '{' || c == '(') {
                parantheses.push(c);//pehle opening wale add kiye empty stack mein
            }
            //compare kiya closing wale ko LIFO se agar nh hai toh T&&T --> condition satisfy-->false dega.
            //agar stack kahli(sahi hai stmt) toh---> balanced nh hai-->return false
            else if(c == ']' && (parantheses.isEmpty() || parantheses.pop() != '[')) return false;//joh add kiya woh pop
            else if (c == '}' && (parantheses.isEmpty() || parantheses.pop() != '{')) return false;
            else if (c == ')' && (parantheses.isEmpty() || parantheses.pop() != '(')) return false;
        }
        return parantheses.isEmpty();//sare pop kiye toh -->stack khali-->sahi-->return true
    }

    public static void main(String[] args) {
        String s="({[]})";
        String p = "";
        System.out.println(isBalanced(s));
        System.out.println(isBalanced(p));
    }

}
