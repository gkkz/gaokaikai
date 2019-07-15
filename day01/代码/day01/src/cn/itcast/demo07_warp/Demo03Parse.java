package cn.itcast.demo07_warp;
/*
    基本类型和字符串的相互转换。

    基本类型 -> 字符串：
        1. 使用String的静态方法valueOf （不推荐）
        2. 调用对应包装类的toString方法.（不推荐）
        3. 直接加上""  （推荐）

    字符串 - > 基本类型
        调用对应包装类的静态 parseXXX方法即可。
        如果要把字符串转int， 那么就调用Integer里面的parseInt方法。
        如果要把字符串转double， 那么就调用Double里面的parseDouble方法。
        如果要把字符串转long， 那么就调用Long里面的parseLong方法。
        ...

        Integer中将String转成int类型的方法
            public static int parseInt(String s) ：将字符串参数转换为对应的int基本类型
 */
public class Demo03Parse {
    public static void main(String[] args) {
        //基本类型 -> 字符串
        int num = 10;
        //1. 使用String的静态方法valueOf
        //String numStr = String.valueOf(num);
        //System.out.println(numStr);

        //2. 调用对应包装类的toString方法.
        //String numStr = Integer.valueOf(10).toString();
        //System.out.println(numStr);

        //3. 直接加上""  （推荐）
        String numStr = num + "";
        System.out.println(numStr);

        System.out.println("==================================");

        //定义一个字符串
        String str = "120";
        //将这个字符串转成一个int数字
        int result = Integer.parseInt(str);
        System.out.println(result);
    }
}
