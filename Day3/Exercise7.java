package com.vpb.day3;

import java.util.ArrayList;

public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<String> studentName = new  ArrayList<>();
        studentName.add("Huyen1");
        studentName.add("Huyen2");
        studentName.add("Huyen3");
        studentName.add("Huyen4");
        studentName.add("Huyen5");
        studentName.add("Huyen6");
        studentName.add("Huyen7");
        studentName.add("Huyen8");
        studentName.add("Huyen9");
        System.out.println("List students name in a class: " + studentName);
        //studentName.remove(1);
        for (int i = 0; i<5;i++){
            studentName.remove(i);
        }
        System.out.println("List students name after remove:" + studentName);




    }
}
