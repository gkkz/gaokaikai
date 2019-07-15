package cn.itcast.demo02_date;

import java.util.Date;

/*
    在Date中，有一个方法叫做getTime，可以获取Date对象对应的毫秒值
        long getTime()： 获取Date对象对应的毫秒值。 这个毫秒值也是从1970年1月1日 0时0分0秒开始的。
 */
public class Demo02Date {
    public static void main(String[] args) {
        //创建Date对象
        Date date = new Date(); // 表示当前的操作系统的人时间。
        //调用getTime方法，获取对应的毫秒值
        long millis = date.getTime();
        //打印
        System.out.println(millis);

    }
}
