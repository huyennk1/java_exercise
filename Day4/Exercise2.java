package com.vpb.day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
       int n;
        Scanner arr= new Scanner(System.in);
        System.out.println(" Nhap kich thuoc mang");
        n= arr.nextInt();
        int a[] = new int[n];
        for (int i=0; i < a.length; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = arr.nextInt();
        }
        System.out.println("Danh sach cac phan tu cua mang: ");
        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }



    }
}
