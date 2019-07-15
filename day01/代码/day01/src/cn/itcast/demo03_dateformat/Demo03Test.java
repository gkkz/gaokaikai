package cn.itcast.demo03_dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    练习： 求出一个人活了多少天了。

    步骤：
        1. 求出这个人出生日期的毫秒值
            a. 键盘录入这个人的出生日期。
            b. 将这个录入的出生日期字符串转成一个Date对象
            c. 获取这个Date对象对应的毫秒值。
        2. 求出当前时间的毫秒值。
            a. 使用空参构造创建一个Date对象，表示的就是当前的时间。
            b. 调用getTime方法，将这个Date对象转成对应的毫秒值。
        3. 相减计算


   ctrl + alt + v 直接生成返回值

 */
public class Demo03Test {
    public static void main(String[] args) throws ParseException {
        //1. 求出这个人出生日期的毫秒值
        //键盘录入这个人的出生日期。
        Scanner sc = new Scanner(System.in);
        System.out.println("请您键盘录入出生日期。 格式为： yyyy-MM-dd");
        String bornStr = sc.nextLine();

        //将这个录入的出生日期字符串转成一个Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date born = sdf.parse(bornStr);

        //获取这个Date对象对应的毫秒值
        long bornMillis = born.getTime();

        //2. 求出当前时间的毫秒值。
        //使用空参构造创建一个Date对象，表示的就是当前的时间。
        Date now = new Date();
        //调用getTime方法，将这个Date对象转成对应的毫秒值。
        long nowMillis = now.getTime();

        //3. 相减计算
        long result = nowMillis - bornMillis;

        System.out.println(result / 1000 / 60 / 60 / 24);
    }
}
