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
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {
    }

    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
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
                        System.out.println(Mgr04.getInstance().hashCode());
                    })
                    .start();
        }
    }
}
