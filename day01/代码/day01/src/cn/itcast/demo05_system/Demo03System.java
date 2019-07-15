package cn.itcast.demo05_system;

import java.util.Arrays;

/*
    在System中还有一个方法叫做arraycopy，可以对数组进行复制。
        static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)： 复制数组的方法。
            参数src： 表示源数组。
            参数srcPos： 表示源数组的起始位置。
            参数dest： 表示目标数组
            参数destPos： 表示目标数组的起始位置。
            参数length： 表示复制的长度（复制几个元素）

    要求：
    将src数组中前3个元素，复制到dest数组的前3个位置上
    复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
    复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]


    这个arraycopy方法是系统级别的，效率非常高。
 */
public class Demo03System {
    public static void main(String[] args) {
        //创建两个数组
        int[] src = {1,2,3,4,5}; //源数组
        int[] dest = {6,7,8,9,10}; //目标数组

        //将src数组中前3个元素，复制到dest数组的前3个位置上
        System.arraycopy(src, 0, dest, 0, 3);

        //打印数组
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
    }
}
