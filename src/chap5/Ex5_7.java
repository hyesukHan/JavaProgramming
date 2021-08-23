package chap5;

public class Ex5_7
{
    public static void main(String[] args) {
        //2차원 배열에 담긴 값의 총합과 평균을 구하는 프로그램
        int[][] arr = {
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total=0;
        int num = 0;
        float average;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                num++;
                total += arr[i][j];
            }
        }
        average = total/(float)num;

        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}
