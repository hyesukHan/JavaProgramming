package chap6;

class MyMath2{
    long a,b;

    long add(){return a+b;}
    long subtract(){return a-b;}
    long multiply(){return a*b;}
    double divide(){return a/b;}

    static long add(long a,long b){return a+b;}
    static long subtract(long a,long b){return a-b;}
    static long multiply(long a,long b){return a*b;}
    static double division(long a,long b){return a/(double)b;}

}
public class Ex6_9 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.subtract(200L,100L));
        System.out.println(MyMath2.multiply(200L,100L));
        System.out.println(MyMath2.division(200L,100L));

        MyMath2 mm = new MyMath2();
        mm.a = 100L;
        mm.b = 200L;

        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.divide());
        System.out.println(mm.multiply());
    }
}
