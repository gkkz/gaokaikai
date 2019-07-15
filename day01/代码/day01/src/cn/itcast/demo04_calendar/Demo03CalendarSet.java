package cn.itcast.demo04_calendar;

import java.util.Calendar;

/*
    在Calendar中，有一个方法叫做set，可以给指定字段设置值。
        void set(int field, int value)：给指定字段设置值。
            参数field：　表示要设置的字段。　建议传递Calendar中的静态常量
            参数value：  要设置成什么值。
 */
public class Demo03CalendarSet {
    public static void main(String[] args) {
        //获取一个日历对象
        Calendar c = Calendar.getInstance();
        //打印这个日历对象的年月日信息
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH));

        //给这个日历对象重新设置时间，将时间设置为 2012-12-21
        c.set(Calendar.YEAR, 2012); // 将年设置到2012
        c.set(Calendar.MONTH, 11); // 将月份设置到11（生活的12月）。
        c.set(Calendar.DAY_OF_MONTH, 21);

        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH));

    }
}
