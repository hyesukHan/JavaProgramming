package chap10;

import java.util.Calendar;

public class Ex10_2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2019,3,29);
        System.out.println("date1은 "+toString(date1));
        System.out.println("date2는"+toString(date2));

        long diff = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
        System.out.println("date1부터 date2까지 "+ diff+"초가 지났습니다.");
        System.out.println("일로 계산하면 "+diff/(60*60*24)+"일이 지났습니다.");


    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년 "+date.get(Calendar.MONTH)+"월 "+date.get(Calendar.DATE)+"일";
    }
}


