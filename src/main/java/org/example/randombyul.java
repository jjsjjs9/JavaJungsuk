package org.example;

import java.util.Scanner;

public class randombyul {
    public static void main(String[] args) {
        int num = 0;
        System.out.print("입력하고 싶은 라인의 수를 입력하세요.> ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();

        num = Integer.parseInt(tmp);


        for (int i = 1; i <=num; i++) {     // 외부 for문 =  "행 " 을 의미.
            for (int j = 1; j <= i; j++) {  // 내부 for문 = "열 " 을 의미.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}