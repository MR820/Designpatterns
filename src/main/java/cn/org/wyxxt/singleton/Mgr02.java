package cn.org.wyxxt.singleton;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/23 2:06 下午
 * @email jsjxzw@163.com
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;

    //使用静态语句块，本质与第一个无区别
    static {
        INSTANCE = new Mgr02();
    }
}
