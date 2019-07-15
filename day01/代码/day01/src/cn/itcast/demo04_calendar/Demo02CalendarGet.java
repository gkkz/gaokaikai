package cn.itcast.demo04_calendar;

import java.util.Calendar;

/*
    在Calendar中，有一个方法叫做get，可以获取日历对象中指定字段的值。
        int get(int field)： 获取指定字段的值， 参数为指定的字段。

        get(年)：获取的就是年的值
        get(月)： 获取的就是月的值
        get(日)： 获取的就是日的值
        ...

    因为get方法参数需要的是int数字，所以我们要使用int数字来表示指定的字段。
    如果每次调用get方法都传递数字，那么就会大大的影响我们的开发速度以及阅读性。
    在Calendar中，提供了大量的静态常量，这些静态常量每一个都表示一个数字，并且
    能够起到见名之意的效果， 所以我们最好向get方法中传递这些静态常量。


    注意：
        Calendar中的月比生活中的月要少1，因为他是从0开始的，范围是0-11
 */
public class Demo02CalendarGet {
    public static void main(String[] args) {
        // 获取一个日历对象
        Calendar c = Calendar.getInstance();
        // 调用get方法，获取指定字段的值
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        // 获取月的值
        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);

        // 获取日的值
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //获取今天是一年中的第几天
        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);
    }
}
