package cn.org.wyxxt.singleton;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/23 2:10 下午
 * @email jsjxzw@163.com
 */


/**
 * 懒汉式
 * 线程不安全
 * 加锁 synchronized
 * 效率降低
 * 试图减少同步代码块的方式提高效率，不可行
 * 双重检查，单例写法
 * <p>
 * 完美写法之一
 * 静态内部类
 * Effictive JAVA
 * 枚举单例
 * 解决线程同步问题，同时还可以防止反序列化 枚举类没有构造方法,无法反射
 */
public enum Mgr09 {


    INSTANCE;

    public void m() {
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    //lambda表达式
                    () -> {
                        System.out.println(Mgr09.INSTANCE.hashCode());
                    })
                    .start();
        }
    }
}
