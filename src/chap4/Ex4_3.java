package chap4;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        //점수를 입력받아 학점을 계산하는 프로그램
        int score ;
        char grade ;

        System.out.print("점수를 입력하세요:");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if(score>=90){
            grade = 'A';
        }else if(score>=80){
            grade = 'B';
        }else if(score>=70){
            grade = 'C';
        }else{
            grade = 'D';
        }

        System.out.println("학점은 "+grade+"입니다.");
    }
}
