package cn.itcast.demo07_warp;
/*
    每一种基本类型都有对应的包装类(引用类型)

    基本类型        包装类（引用类型）
    byte            Byte
    short           Short
    int             Integer(特殊)
    long            Long
    float           Float
    double          Double
    boolean         Boolean
    char            Character(特殊)

    基本类型只是一些单纯的数据，只能直接使用或者运算，不能去调用方法，功能非常简单
    包装类是引用类型， 如果使用包装类，不仅可以表示一些数据，还能够调用方法完成一些功能， 功能是非常强大的。

    基本类型能做的包装类也能做， 但是包装类能做的基本类型不一定能做。
    包装类和基本类型的使用方式基本一致。


    自动拆装箱（JDK5及之后的新特性）：

    拆箱： 将包装类转成对应的基本类型
    装箱： 将基本类型转成对应的包装类
    自动拆装箱指的是基本类型和对应的包装类可以自动进行转换
 */
public class Demo01Warp {
    public static void main(String[] args) {
        //自动装箱 将int类型的10赋值给Integer类型的a，会自动把int类型的10装箱成Integer类型
        Integer a = 10;
        //自动装箱 将int类型的20赋值给Integer类型的b，会自动把int类型的20装箱成Integer类型
        Integer b = 20;
        //先自动拆箱： 先将a和b转成int类型，然后求出相加之后的结果， 结果也是int类型。
        //后自动装箱： 将计算出来的int类型的结果赋值给Integer类型的变量， 会自动装箱。
        Integer sum = a + b;
        System.out.println(sum);
    }
}
