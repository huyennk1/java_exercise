package com.vpb.day3;

import java.util.ArrayList;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<String> arrStudents = new ArrayList<>();
        arrStudents.add( "Nguyen Van A");
        arrStudents.add("Nguyen Van B");
        arrStudents.add("Nguyen Van C");
        arrStudents.add("Nguyen Van D");
        arrStudents.add("Nguyen Van E");
        arrStudents.add("Nguyen Van G");
        arrStudents.add("Nguyen Van H");
        System.out.println("The list of students name:" + arrStudents);
        /* add new student name to list*/
        arrStudents.add(0,"NGuyen Van A1"); // Them 1 student de len phan tu 0
        arrStudents.add(8," Nguyen Van Tam");
        arrStudents.set(4,"Nguyen Khanh Huyen");
        System.out.println("Current list of students name: "+ arrStudents);

        arrStudents.remove(2);
        arrStudents.remove("Nguyen Van G");
        System.out.println(" Current list of student name: "+ arrStudents);



    }
}
