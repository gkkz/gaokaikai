package cn.itcast.demo06_stringbuilder;
/*
    StringBuilder中的常见方法：
        StringBuilder append(任意类型)： 将任意类型的数据拼接到StringBuilder上。 返回值为调用者对象.
        String toString()： 将StringBuilder转成一个String.
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //调用append方法，进行拼接
        //StringBuilder newSb = sb.append("你好");
        //System.out.println("sb:" + sb);
        //System.out.println("newSb:" + sb);

        //向sb上面拼接各种类型的数据
        /*
        sb.append("你好");
        sb.append(10);
        sb.append(3.14);
        sb.append(true);
        sb.append('a');
        System.out.println("sb:" + sb);
        */

        //链式编程
        sb.append("你好").append(10).append(3.14).append(true);

        //打印结果
        System.out.println("sb:" + sb);

        //调用StringBuilder的toString方法，将StringBuilder对象转成String
        String ss = sb.toString();
        System.out.println("ss:" + ss);
    }
}
