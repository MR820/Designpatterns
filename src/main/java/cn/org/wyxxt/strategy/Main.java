package cn.org.wyxxt.strategy;

import java.util.Arrays;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/23 4:15 下午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) {
//        int[] a = {9, 2, 3, 5, 7, 1, 4};

//        Cat[] a = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};

        Dog[] a = {new Dog(3), new Dog(5), new Dog(1)};

        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
