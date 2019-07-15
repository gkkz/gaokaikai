package cn.itcast.demo04_calendar;

import java.util.Calendar;

/*
    在Date类中，有很多方法都已经过时了。 原因是有Calendar中的方法代替了。

    Calendar叫做日历类， 但是Calendar也能表示特定的时间瞬间， 精确到毫秒。

    Calendar是一个抽象类，如果要用，需要使用子类。 Calendar有点特殊，子类对象不是要我们自己new的
    而是通过静态方法获取到的。

    Calendar中，有一个方法，可以获取一个日历对象（Calendar子类对象）
        static Calendar getInstance()： 获取一个日历对象。

    注意： 和之前的区别， 之前想要获取对象都是自己new，而此时Calendar对象是通过calendar的静态方法getInstance方法
    获取的。
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        //通过Calendar的静态方法getInstance获取一个日历对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
