package chap6;

public class Ex6_7 {
    public static void main(String[] args) {
        Data2 d2 = new Data2();
        d2.x = 10;
        System.out.println("main() x = "+d2.x);
        change(d2);
        System.out.println("main() x = "+d2.x);
    }
    static void change(Data2 d){
        d.x = 1000;
        System.out.println("change = x :"+d.x);
    }

}
class Data2{
    int x;
}
