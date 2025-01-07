package org.example;

public class ArrayEx8 {
    public static void main(String[] args) {
        int [] ball = new int[45];      // 정수형 변수 45개 생성.

        for (int i = 0; i < ball.length ; i++) {    // ball배열의 길이만큼 반복하고
            ball[i] = i+1;  // ball[0] 에는 1이 저장.
        }

        int temp = 0;       // 두 값을 바꾸는 임시변수 temp 선언.
        int j = 0;          // 값을 저장할 변수 j 선언.

        for (int i = 0; i < 6; i++) {       // 6개만 바꾼다.
            j = (int)(Math.random() * 45);  // 로또번호가 총 45개이므로 45개의 난수를 생성.
            temp = ball[i]; // 값을 서로 바꾸기
            ball[i] = ball[j];//
            ball[j] = temp;//
        }

        for (int i = 0; i <6 ; i++) {
            System.out.printf("ball[%d] = %d\n", i, ball[i]);   // 6개 요소 출력.
        }
    }
}
