package cn.itcast.demo05_system;
/*
    验证for循环打印数字1-9999所需要使用的时间（毫秒）

    思路：
        在循环打印之前记录一下操作系统的时间
        在循环打印之后记录一下操作系统的时间。
        相减。
 */
public class Demo02SystemTest {
    public static void main(String[] args) {
        //在循环打印之前记录一下操作系统的时间
        long start = System.currentTimeMillis();
        //循环打印
        for(int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }
        //在循环打印之后记录一下操作系统的时间。
        long end = System.currentTimeMillis();
        //相减。
        System.out.println(end - start);
    }
}
