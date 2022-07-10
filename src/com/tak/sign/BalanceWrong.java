package com.tak.sign;

import java.util.Scanner;

public class BalanceWrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("변수 a : ");
        int a = sc.nextInt();

        System.out.print("변수 b : ");
        int b = sc.nextInt();

        int diff = a - b;
        if (diff > 0) {
            System.out.println("a가 크다.");
        } else if (diff < 0) {
            System.out.println("b가 크다.");
        } else {
            System.out.println("a와 b가 같다.");
        }


    }


}
