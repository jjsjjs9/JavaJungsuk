package org.example;

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0 ;   // 총합 변수 선언.
        float average = 0f; // 평균을 위한 변수 선언.

        int[] score = {100,88,100,100,90};      // 점수를 담을 정수형 변수 5개 선언.

        for (int i = 0; i < score.length ; i++) {       // 배열의 길이만큼 반복하고
            sum += score[i];            // 총합은 score의 모든 인덱스 값을 다 더한다.
        }
        average = sum / (float) score.length;       // 평균은 총합에서 배열의 길이만큼 나눠주고 캐스팅해준다.

        System.out.println("총점 :  " + sum);
        System.out.println("평균 : " + average);
    }
}
