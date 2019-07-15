package cn.itcast.demo01_object;

import java.util.Objects;

/*
    在Java中有一个工具类叫做Objects，里面有一些方法支持对对象进行操作。

    static boolean equals(Object a, Object b)： 用来比较a对象和b对象是否相同。

    当通过工具类Objects调用equals方法时，内部会调用Object中的equals方法，所以如果要
    比较两个对象的内容，还需要在子类中重写equals方法。
 */
public class Demo04ObjectsEquals {
    public static void main(String[] args) {
        //创建两个Teacher对象
        Teacher t1 = new Teacher("小苍老师", 18);
        Teacher t2 = new Teacher("小苍老师", 18);

        //使用Objects的equals比较t1和t2是否相同
        System.out.println(t1.equals(t2));  //true
        System.out.println(Objects.equals(t1, t2)); //true

        System.out.println("=======================================");
        Teacher t3 = null;
        Teacher t4 = null;
        //System.out.println(t3.equals(t4)); // NullPointerException
        System.out.println(Objects.equals(t3, t4)); //true

    }
}
