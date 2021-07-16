package chap5;

public class Ex5_2 {
    public static void main(String[] args) {
        //배열요소의 총합과 평균값을 구하는 프로그램

        int sum = 0;
        float average;

        int[] score = {100,88,100,100,90};

        for (int j : score) {
            sum += j;
        }

        average = sum/(float)score.length;

        System.out.println("총합: "+sum);
        System.out.println("평균: "+average);
    }
}
