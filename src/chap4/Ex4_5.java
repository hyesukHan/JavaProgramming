package chap4;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        //임의의 수를 입력받아 랜덤한 수의 마지노선으로 하고
        //난수를 발생시켜 별을 찍는 프로그램

        int range;
        Scanner scan = new Scanner(System.in);
        range = scan.nextInt();

        int num = (int)(Math.random()*range)+1;
        System.out.println("랜덤한 수는 "+num);

        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}
