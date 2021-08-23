package chap5;

public class Ex5_3 {
    public static void main(String[] args) {
        //배열의 최대값과 최소값을 구하는 프로그램

        int[] score = {79,88,91,33,100,55,95};

        int max = score[0];
        int min = score[0];

        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                max = score[i];
            }
            else if(score[i]<min){
                min = score[i];
            }
        }


        System.out.println(max);
        System.out.println(min);
    }
}
