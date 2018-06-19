package com.vpb.day2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString;
        System.out.print("Please input string: ");
        do {
            inputString= input.next();
            Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]+");
            Matcher matcher = pattern.matcher(inputString);
            if (matcher.matches()){
                System.out.print("Inputted String is: " + inputString);
                break;
            }else
                System.out.println("Wrong format, please type again");
        } while (true);


    }
}
