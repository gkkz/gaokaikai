package cn.itcast.demo04_calendar;

import java.util.Calendar;
import java.util.Date;

/*
    Calendar中的getTime 可以将一个日历对象转成一个Date对象。
        Date getTime()： 将对应的日历对象转成一个Date
 */
public class Demo05CalendarGetTime {
    public static void main(String[] args) {
        //获取一个日历对象
        Calendar c = Calendar.getInstance();
        //打印日历对象的年月日信息
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH));

        //将这个日历对象转成一个Date对象
        Date date = c.getTime();
        System.out.println(date);
    }
}
