package cn.org.wyxxt.flyweight;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/4 2:29 下午
 * @email jsjxzw@163.com
 */

/**
 * flyweight
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = "abc"; //常量池
        String s2 = "abc";
        String s3 = new String("abc"); // 堆里面有对象
        String s4 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s3.intern() == s1);
        System.out.println(s3.intern() == s4.intern());
    }
}
