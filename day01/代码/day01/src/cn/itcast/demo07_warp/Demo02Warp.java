package cn.itcast.demo07_warp;
/*
    手动拆装箱

    手动装箱（int->Integer）
        使用Integer中的静态方法valueOf即可
        static Integer valueOf(int i)： 将一个int类型的数据转成Integer然后返回。

    手动拆箱（Integer -> int）
        使用包装类对象的intValue方法即可
 */
public class Demo02Warp {
    public static void main(String[] args) {
        //定义一个int数字
        int num = 20;
        //手动装箱
        Integer warpNumber = Integer.valueOf(num);
        System.out.println(warpNumber);

        //手动拆箱
        int basicNumber = warpNumber.intValue();
        System.out.println(basicNumber);
    }
}
