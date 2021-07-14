package chap3;

public class Ex3_2 {
    public static void main(String[] args) {
        //Math.round()로 반올림하는 예제
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000)/1000.0; //소수점 넷째자리에서 반올림
        System.out.println(shortPi);
    }
}
