package org.example;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,100,55,95};      // 정수형 변수 선언.

        int max = score[0];     // 배열의 첫번째 값으로 최대값 max를 초기화한다.
        int min = score[0];     // 배열의 첫 번째 값으로 최소값 min을 초기화한다.

        for (int i = 1; i < score.length ; i++) {       // 배열의 두 번째 값부터 읽기 위해 i=1로 초기화, 배열 길이까지 반복.
            if(score[i] > max){     // 배열값이 max보다 클 경우
                max = score[i];     // 그 값이 max다.
            }
            else if (score[i] < min){   // 배열값이 min보다 작을 경우
                min = score[i];     // 그 값이 최소값.
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

    }
}
