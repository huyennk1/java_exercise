package com.vpb.day2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.print("Please input first number: ");
        firstNumber = input.nextInt();
        System.out.print("Please input second number: ");
        secondNumber = input.nextInt();
       if (firstNumber <= secondNumber) {
           for (int i = firstNumber; i <= secondNumber; i++) {
               System.out.println(i);
           }
       }else{
           for (int i = firstNumber; i >= secondNumber; i--){
               System.out.println(i);
           }
       }

    }
}
