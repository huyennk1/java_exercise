package com.vpb.dayone;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //  Nhập dữ liệu từ bàn phím
        int firtNumber;
        System.out.print("Hãy nhập số thứ nhất: ");
        firtNumber = input.nextInt(); // Hàm nextInt() để nhập số nguyên từ bàn phím
        int secondNumber;
        System.out.print("Hãy nhập số thứ hai: ");
        secondNumber = input.nextInt();
        int total;
        total= firtNumber + secondNumber;
        System.out.println("Tổng 2 số là: " + total); // In kết quả
    }
}
