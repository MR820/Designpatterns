package cn.org.wyxxt.observer.v2;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/3 3:36 下午
 * @email jsjxzw@163.com
 */
class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("waked up! crying wuwuwu...");
        cry = true;
    }
}


public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
    }
}