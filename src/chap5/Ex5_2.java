package chap5;

public class Ex5_2 {
    public static void main(String[] args) {
        //배열요소의 총합과 평균값을 구하는 프로그램

        int sum = 0;
        double average = 0;

        int[] score = {100,88,100,100,90};

        for(int i=0;i<score.length;i++){
            sum+= score[i];
        }

        average = (double)sum/score.length;

        System.out.println(sum);
        System.out.println(average);
    }
}
