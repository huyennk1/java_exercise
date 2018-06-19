package com.vpb.day2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int month;
       do {
            System.out.println("Please input a month (1-12) ");
            month= input.nextInt();
        }
       while (month > 12 || month < 1);

        switch (month){
            case    1:
                System.out.println("Total day of January is 31 day");
                break;
            case    2:
                System.out.println("Total day of February is 28 day");
                break;
            case    3:
                System.out.println("Total day of March is 30 day");
                break;
            case    4:
                System.out.println("Total day of April is 31 day");
                break;
            case    5:
                System.out.println("Total day of May is 30 day");
                break;
            case    6:
                System.out.println("Total day of June is 31 day");
                break;
            case    7:
                System.out.println("Total day of July is 30 day");
                break;
            case    8:
                System.out.println("Total day of August is 31 day");
                break;
            case    9:
                System.out.println("Total day of September is 30 day");
                break;
            case    10:
                System.out.println("Total day of October is 31 day");
                break;
            case    11:
                System.out.println("Total day of November is 30 day");
                break;
            case    12:
                System.out.println("Total day of December is 31 day");
                break;


        }

    }
}
