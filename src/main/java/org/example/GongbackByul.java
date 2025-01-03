package org.example;

public class GongbackByul {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {   // 같으면 출력
                    System.out.printf("*");
                } else {    // 아니면 공백.
                    System.out.printf("%5c", ' ');
                }
            }
            System.out.println();
        }
    }
}
