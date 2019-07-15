package cn.itcast.demo06_stringbuilder;

/*
    StringBuilder是一个可变的字符序列(字符串)， 本质是一个char数组。
    在JDK8以及之前： char数组
    在JDK9以及之后： byte数组。

    StringBuilder和String的区别
    StringBuilder 可以改变
    String 不可改变。


    StringBuilder构造方法：
        StringBuilder()： 空参构造。  相当于 String str = "";
        StringBuilder(String str)：根据传递的字符串构建一个StringBuilder对象

 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        // 使用空参构造创建StringBuilder
        StringBuilder sb = new StringBuilder(); //使用空参构造创建的对象，此StringBuilder中不包含任何内容
        System.out.println("sb:" + sb);

        // 使用有参构造创建StringBuilder
        StringBuilder sb2 = new StringBuilder("今天中午吃红烧牛肉蛋炒饭");
        System.out.println("sb2:" + sb2);
    }
}
