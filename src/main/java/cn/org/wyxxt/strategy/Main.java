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

        Sorter<Dog> sorter = new Sorter();
//        sorter.sort(a, new DogComparator());
        sorter.sort(a, (o1, o2) -> {
            if (o1.food < o2.food) return -1;
            else if (o1.food > o2.food) return 1;
            return 0;
        });
        System.out.println(Arrays.toString(a));
    }
}
