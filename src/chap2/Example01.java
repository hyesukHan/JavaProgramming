package chap2;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        //정수값을 입력받아 변수에 저장한 후 문자열과 문자로 변환해 출력하는 프로그램
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요:");
        num= scan.nextInt();  //정수를 입력받아 변수에 저장

        System.out.println(num+""); //문자열로 변환해 출력

    }
}
