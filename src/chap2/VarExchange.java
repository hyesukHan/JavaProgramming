package chap2;

public class VarExchange {
    public static void main(String[] args) {
        //두 변수 x,y의 값을 서로 바꾸고 출력하는 프로그램
        int x = 10;
        int y = 5;


        System.out.println("변경 전");
        System.out.println("x= "+x);
        System.out.println("y= "+y);

        int tmp = x;  //x,y를 변경하는 코드
        x = y;
        y = tmp;

        System.out.println("변경 후");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }
}
