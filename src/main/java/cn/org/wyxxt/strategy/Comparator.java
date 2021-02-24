package cn.org.wyxxt.strategy;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/23 6:17 下午
 * @email jsjxzw@163.com
 */

@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);

    //1.8以后可以写实现方法
    default void m() {
        System.out.println("m");
    }
}
