package org.example;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];     // 0~9까지 숫자가 담긴 변수 선언.

        for (int i = 0; i < numArr.length; i++) {   // 배열을 0~9까지 숫자로 초기화.
            numArr[i] = i;
            System.out.print(numArr[i]);    // numArr 배열값 출력.
        }
        System.out.println();

        for (int i = 0; i < 100; i++) { // 배열의 요소를 교환하는 작업을 100번 반복.
            int n = (int) (Math.random() * 10); // 0~9사이 임의의 값을 얻는다.
            int tmp = numArr[0];    // tmp변수를 통해 변수를 바꾼다.
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for (int i = 0; i < numArr.length; i++) {   // 랜덤으로 바꾼 배열값을 출력.
            System.out.print(numArr[i]);
        }
    }
}
