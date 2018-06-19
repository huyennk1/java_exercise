package com.vpb.day3;

public class Exercise5 {
    public static void main(String[] args) {
        String s1 = "tit tit tit";
        String s2 = new StringBuffer(s1).reverse().toString();
        if (s1.equals(s2)){
            System.out.println("the string is Palindrome ");
        } else
            System.out.println("the string is not Palindrome ");


    }
}
