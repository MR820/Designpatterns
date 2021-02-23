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
 */
public class Mgr08 {

    private Mgr08() {
    }

    // JVM加载类的时候，只加载一次
    private static class Mgr08Holder {
        private final static Mgr08 INSTANCE = new Mgr08();
    }

    public static Mgr08 getInstance() {
        return Mgr08Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    //lambda表达式
                    () -> {
                        System.out.println(Mgr08.getInstance().hashCode());
                    })
                    .start();
        }
    }
}
