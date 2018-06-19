package com.vpb.dayone;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Nhập số a: ");
        a = input.nextInt();
        System.out.print("Nhập số b: ");
        b = input.nextInt();
        System.out.print("Nhập số c: ");
        c= input.nextInt();
        if (a == 0){
            if (b==0&&c==0){
                System.out.println("Phương trình có vô số nghiệm");
            }else if (b==0&& c!=0)
                System.out.println("Phương trình vô nghiệm");
            else 
            System.out.println("Phương trình có nghiệm duy nhất là : "+ (-c/(b*1.0)));
        }else {
            double delta, nghiem1, nghiem2, sqrtDelta;
            delta = b*b - 4*a*c;
            if (delta < 0){
                System.out.println("Phương trình vô nghiệm");
            } else {
                sqrtDelta = Math.sqrt(delta);
                nghiem1 = (-1*b +sqrtDelta)/(2*a);
                nghiem2 = (b - sqrtDelta)/(2*a);
                System.out.println("Nghiệm thứ nhất là :"+ nghiem1);
                System.out.println("Nghiệm thứ hai là: "+ nghiem2);
            }
        }
    }
}
