package cn.itcast.demo04_calendar;

import java.util.Calendar;

/*
    在Calendar中有一个方法叫做add，可以对指定字段的值进行计算。
        void add(int field, int amount)： 对指定字段进行计算
            参数field： 要对哪个字段进行计算
            参数amount： 如何计算。
                        如果向这个参数位置传递正数，那么就表示加上该值。
                        如果向这个参数位置传递负数，那么就表示减去该值。
 */
public class Demo04CalendarAdd {
    public static void main(String[] args) {
        //获取一个Calendar对象
        Calendar c = Calendar.getInstance();
        //打印这个日历对象的年月日
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH));

        //调用add方法，对指定字段的值计算
        //将年这个字段的值加上2
        //c.add(Calendar.YEAR, 2);

        //将月的字段加上2
        c.add(Calendar.MONTH, 2);


        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH));
    }
}
