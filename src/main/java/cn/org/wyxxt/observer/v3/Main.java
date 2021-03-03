package cn.org.wyxxt.observer.v3;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/3 3:36 下午
 * @email jsjxzw@163.com
 */
class Child {
    private boolean cry = false;
    private Dad d = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
//        System.out.println("waked up! crying wuwuwu...");
        cry = true;
        d.feed();
    }
}

class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}


public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        //do something
        child.wakeUp();
    }
}