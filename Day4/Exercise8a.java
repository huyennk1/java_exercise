package com.vpb.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise8a {
    ArrayList<String> student = new ArrayList<>();

    public static void main(String[] args) {
        Exercise8a exercise8a= new Exercise8a();
        Scanner n = new Scanner(System.in);
        while (true){
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Please select function you wish to perform : ");
            System.out.println("1 Add Student ");
            System.out.println("2 Show All Student");
            System.out.println("3 Remove Student ");
            int function = n.nextInt();
            switch (function){
                case 1:
                    exercise8a.addStudent();
                break;
                case 2:
                    exercise8a.showAllStudent();
                break;
                case 3:
                    exercise8a.removeStudent();
                break;
                default:
                    System.out.println("Please select function you wish to perform");
                    break;

            }
        }
    }
    public void addStudent(){
        System.out.println(" YOu select 1 ");
        System.out.println("Please provide student name ");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        student.add(name);
    }
    public  void showAllStudent(){
        System.out.println("You select 2");
        System.out.println("All student in list: ");
        for (int i=0; i< student.size();i++){
            System.out.println(student.get(i));
        }
    }
    public  void removeStudent(){
        System.out.println("You select 3");
        System.out.println(" Please select student you want remove: ");
        for (int i=0; i< student.size();i++){
            System.out.println(i+ ": " + student.get(i));
        }
        Scanner s =new Scanner(System.in);
        int number= s.nextInt();
        student.remove(number);

    }
}
