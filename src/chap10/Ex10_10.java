package chap10;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner scan = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 "+pattern+ "의 형태로 입력해주세요. 입력예:2019/3/24");

        while(scan.hasNext()){
            try {
                inDate = df.parse(scan.next());
                break;
            }catch (Exception e){
                System.out.println("날짜를 "+pattern+"의 형태로 다시 입력해주세요.");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long time = (cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);
        System.out.println("입력하신 날짜는 현재와 "+time+"시간 차이가 있습니다.");
    }
}
