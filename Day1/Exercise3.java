package com.vpb.dayone;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number;
        System.out.print("Hãy nhập 1 số: ");
        number = input.nextDouble();
        double squareRoot = Math.sqrt(number); // Tính căn bậc 2
        System.out.println("Căn bâc hai là:"+ squareRoot);
    }
}
