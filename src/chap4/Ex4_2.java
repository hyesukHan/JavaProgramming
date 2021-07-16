package chap4;

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        //정수를 입력받아 0인지 판별하는 프로그램
        System.out.println("숫자를 하나 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num==0)
            System.out.println("num은 0입니다.");
        else
            System.out.println("num은 0이 아닙니다.");
    }
}
