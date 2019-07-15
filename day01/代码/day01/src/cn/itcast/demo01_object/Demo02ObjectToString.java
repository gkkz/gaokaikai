package cn.itcast.demo01_object;
/*
    在Object中，有一个方法，叫做toString，可以将一个对象转成对应的字符串。
        String toString()： 返回对象的字符串表示形式。

    当通过一个对象调用toString方法时，会看一下自己有没有这个方法。 如果没有，那么就会向上找父类，一直找到
    Object， 而Object中的toString，是转成地址值显示。

    如果直接打印一个对象名，那么内部也会调用这个对象的toString方法，也就是说这个对象的toString是什么
    那么直接打印这个对象名出现的结果就是什么。

    如果想要调用toString方法后看到对象的内容（属性），那么可以在子类中重写toString方法。

 */
public class Demo02ObjectToString {
    public static void main(String[] args) {
        //创建Person对象
        Person p = new Person("小苍", 18);
        System.out.println(p.toString()); //小苍 - 18

        System.out.println(p); // 小苍 - 18
    }
}
