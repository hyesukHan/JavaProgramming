package chap3;

public class Ex3_1 {
    public static void main(String[] args) {
        int i=5 , j=0;
        j = i++;
        System.out.println("j=i++ 실행 후, j="+j+" i="+i);

        i=5;
        j=0;
        j = ++i;
        System.out.println("j=i++ 실행 후, j="+j+" i="+i);

    }
}
