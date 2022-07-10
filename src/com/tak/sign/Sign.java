package com.tak.sign;

import java.util.Scanner;

public class Sign {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정숫값을 입력하세요 : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("값이 양수입니다.");
        } else if (number < 0) {
            System.out.println("값이 음수입니다.");
        } else {
            System.out.println("값이 0 입니다.");
        }
    }
}
