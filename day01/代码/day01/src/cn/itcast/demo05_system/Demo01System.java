package cn.itcast.demo05_system;
/*
    System是系统类，里面提供了大量的静态方法支持系统相关的操作。

    里面有一个方法，可以直接获取当前操作系统的时间（以毫秒值为单位的）
        static long currentTimeMillis()：获取当前系统的时间（以毫秒值为单位的）
 */
public class Demo01System {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        System.out.println(millis);
    }
}
