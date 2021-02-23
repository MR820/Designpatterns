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
 */
public class Mgr06 {
    private static Mgr06 INSTANCE;

    private Mgr06() {
    }

    public static Mgr06 getInstance() {
        if (INSTANCE == null) {
            // 双重检查
            synchronized (Mgr06.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }

        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(
                    //lambda表达式
                    () -> {
                        System.out.println(Mgr06.getInstance().hashCode());
                    })
                    .start();
        }
    }
}
