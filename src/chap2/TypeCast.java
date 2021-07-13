package chap2;

public class TypeCast {
    public static void main(String[] args) {
        //타입간 형변환을 보여주는 프로그램
        String str = "3";

        System.out.println(str.charAt(0)-'0'); //문자를 숫자로 변환
        System.out.println(Integer.parseInt("3")+1); //문자열을 숫자로 변환
        System.out.println("3"+1); //1이 문자열로 변환
        System.out.println((char)(3+'0')); //숫자를 문자로 변환

    }
}
