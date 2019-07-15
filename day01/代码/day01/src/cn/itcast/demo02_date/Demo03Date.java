package cn.itcast.demo02_date;

import java.util.Date;

/*
    在Date类中，还有一个方法叫做setTime，可以设置毫秒值。
        void setTime(long time)：设置毫秒值，　参数ｔｉｍｅ表示要设置的毫秒值.
 */
public class Demo03Date {
    public static void main(String[] args) {
        //创建Date对象
        Date date = new Date();
        System.out.println(date);

        //调用date的setTime，重新设置时间。
        date.setTime(0L);
        System.out.println(date);
    }
}
