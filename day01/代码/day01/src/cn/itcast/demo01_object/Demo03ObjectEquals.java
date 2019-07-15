package cn.itcast.demo01_object;
/*
    如果==比较的是引用类型，那么比较的是地址值

    在Object中，有一个方法叫做equals，可以比较两个对象是否相同。
        boolean equals(Object obj)： 比较两个对象是否相同。

    如果通过一个对象调用equals方法，会先看一下自己有没有这个方法，如果没有，那么就会向上找父类，一直
    到Object， 而Object中的equals方法，是在使用==比较地址值。

    如果想要定义自己的比较规则，比如两个对象的属性完全相同，那么就看成是同一个对象， 那么我们需要在
    子类中重写Object的equals方法。
 */
public class Demo03ObjectEquals {
    public static void main(String[] args) {
        //创建三个Person对象
        Person p1 = new Person("王宝强", 28);
        Person p2 = new Person("贾乃亮", 24);
        Person p3 = new Person("贾乃亮", 24);
        //使用==比较这些对象
        System.out.println(p1 == p2); //false
        System.out.println(p2 == p3); //false
        System.out.println("------------------------------------------");
        System.out.println(p1.equals(p2)); // false
        System.out.println(p2.equals(p3)); // true
    }
}
