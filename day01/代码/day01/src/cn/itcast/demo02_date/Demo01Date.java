package cn.itcast.demo02_date;

import java.util.Date;

/*
    在java中，有一个类叫做Date，他表示精确的时间瞬间，精确到毫秒。

    Date 构造方法：
        Date()： 会以当前操作系统的时间构建一个Date对象。
        Date(long date)：参数需要传递一个long类型的毫秒值。 表示从1970年1月1日 0时0分0秒 开始过了多少毫秒。

   中国是东八区， 比标准时间要快8个小时， 所以在中国时间是从 1970年1月1日 8时0分0秒 开始的。
 */
public class Demo01Date {
    public static void main(String[] args) {
        //使用空参数构造方法创建一个Date对象
        Date date = new Date();
        System.out.println(date);

        //使用有参构造方法创建一个Date对象
        Date date2 = new Date(0L);
        System.out.println(date2);
    }
}
