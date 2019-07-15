package cn.itcast.demo06_stringbuilder;

/*
    字符串拼接产生的问题

    因为字符串具有不变性，所以每次拼接都会产生一个新的字符串， 这样既耗时，又浪费空间。

    StringBuilder可以看成一个可变的字符串， 每次拼接不会产生新的字符串， 会直接对原来的字符串
    进行改变。 这样就解决了字符串拼接带来的性能以及空间浪费的问题。

 */
public class Demo01String {
    public static void main(String[] args) {
        String s = "Hello";
        s += "World";
        System.out.println(s);
    }
}
