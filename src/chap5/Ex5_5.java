package chap5;

public class Ex5_5 {
    public static void main(String[] args) {

        int[] ball = new int[45];

        for(int i=0;i<ball.length;i++){
            ball[i] = i+1;
        }

        int tmp;
        for(int i=0;i<100;i++){
            int n = (int)(Math.random()*45);
            tmp = ball[0];
            ball[0] = ball[n];
            ball[n] = tmp;

        }

        for(int i=0;i<6;i++){
            System.out.println("ball["+i+"]="+ball[i]);
        }
    }
}
