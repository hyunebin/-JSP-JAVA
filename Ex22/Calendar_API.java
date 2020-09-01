package Ex22;

import java.util.Calendar;

public class Calendar_API {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance(); // 싱글톤
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int m = calendar.get(calendar.MINUTE);
        int s = calendar.get(calendar.SECOND);

        System.out.println("현재 시각은 " + year + " 년 " + month + " 월 " + day + " 일 " + hour + " 시 "
        + m + " 분 " + s + " 초 입니다.");

    }
}
