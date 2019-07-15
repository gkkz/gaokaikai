package cn.itcast.demo03_dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    如果我们想要将Date对象转成指定格式的字符串，那么我们可以对Date进行格式化。

    在Java中，有一个类可以对Date进行格式化，这个类叫做DateFormat。
    DateFormat是抽象类，如果要用，需要使用子类， 最常用子类是 SimpleDateFormat

    SimpleDateFormat的构造方法：
        SimpleDateFormat(String pattern)： 根据指定的模式构建一个SimpleDateFormat对象。 参数pattern是传递的模式。

    模式指的就是转换的格式。
        要转成的格式： 2018年11月05日 10时12分21秒
        对应的模式：   yyyy年MM月dd日 HH时mm分ss秒
    模式要使用英语字母代替掉时间中的一些动态的数字。
        年： y
        月： M
        日： d
        时： H
        分： m
        秒： s

    用于格式化的方法：
        String format(Date date)： 将一个日期根据构造方法中传递的模式转成一个字符串。

    格式化的步骤：
        1. 创建一个SimpleDateFormat对象，传递一个模式。
        2. 调用format方法，传递Date对象。
        3. 输出结果
 */
public class Demo01DateFormat {
    public static void main(String[] args) {
        //创建Date对象
        Date date = new Date();

        //创建一个SimpleDateFormat对象，传递一个模式。
        //指定的格式 -> 2018年11月05日 10时12分21秒
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        //创建一个SimpleDateFormat对象，传递一个模式。
        //指定的格式 -> 2019-11-05 10:12:21
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //调用format方法，传递Date对象。
        String str = sdf.format(date);
        //输出结果
        System.out.println(str);
    }
}
