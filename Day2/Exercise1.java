package com.vpb.day2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
    /*1.	Check number is odd or even
 If user not input number , show log “You must input numeric type” and user will have to re-type number */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String inputString;
        //System.out.print("Hãy nhập vào 1 số:");
        do {
            System.out.println("Hãy nhập vào 1 số:");
            inputString = input.next();
            Pattern pattern = Pattern.compile("\\d*"); // kiểm tra chuỗi nhập vào có phải là 1 số không
            Matcher matcher = pattern.matcher(inputString);
            if (matcher.matches()) {
                System.out.println("So vưa nhap vao la " + inputString);
                number = Integer.parseInt(inputString); // convert String sang Integer
                break;
            } else {
                System.out.println("Ban phai nhap so");
            }
        }while (true);
        if (number%2==0)
            System.out.println("Số bạn vừa nhập là số chẵn");
        else
            System.out.println("số bạn nhập là số lẻ");

    }

}
