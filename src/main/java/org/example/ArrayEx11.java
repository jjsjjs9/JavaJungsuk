package org.example;

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];     // 길이가 10인 배열 생성.
        int[] counter = new int[10];    // 카운트 하기 위한 길이가 10인 배열 생성.

        for (int i = 0; i < numArr.length ; i++) {  // numarr길이만큼 반복
            numArr[i] = (int)(Math.random() * 10);  // 0~9까지의 난수를 numarr에 생성.
            System.out.print(numArr[i]);    // 출력
        }
        System.out.println();

        for (int i = 0; i < numArr.length ; i++) {      // 그 배열 길이만큼 반복하고
            counter[numArr[i]]++;       // counter배열에 담는다.
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 갯수:" + counter[i]);       // 반복되는 갯수 출력.
        }
    }
}
