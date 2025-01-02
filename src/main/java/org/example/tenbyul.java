package org.example;

public class tenbyul {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {     // 외부 for문 =  "행 " 을 의미.
            for (int j = 1; j <= 5; j++) {  // 내부 for문 = "열 " 을 의미.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}