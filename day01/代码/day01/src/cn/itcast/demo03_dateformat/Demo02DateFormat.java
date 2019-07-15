package cn.itcast.demo03_dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    如果想要把一个字符串转成一个Date对象也可以使用SimpleDateFormat去实现。 将字符串转成Date对象一般叫做解析。

    SimpleDateFormat中有一个方法，叫做parse，可以将字符串转成Date
        Date parse(String source)： 将参数字符串转成一个Date对象。


    使用步骤：
        1. 创建SimpleDateFormat对象， 要传递一个模式
        2. 调用parse方法，传递字符串，将这个字符串转成Date
        3. 输出结果

    注意：
        1. 创建SimpleDateFormat对象时，给出的模式一定要和字符串的格式匹配。
        2. 调用parse方法后下面有一个红线，这个方法是需要抛出异常的， 把鼠标移动到红线上面，然后按 alt + 回车，
            选择第一个.

    总结：
        Date -> String（格式化）：
            使用SimpleDateFormat中的format方法去实现。

        String -> Date（解析）：
            使用SimpleDateFormat中的parse方法去实现。
 */
public class Demo02DateFormat {
    public static void main(String[] args) throws ParseException {
        //定义一个字符串
        String str = "2018-11-05 10:16:38";

        //创建SimpleDateFormat对象， 要传递一个模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用parse方法，传递字符串，将这个字符串转成Date
        Date date = sdf.parse(str);

        //打印Date
        System.out.println(date);

    }
}
