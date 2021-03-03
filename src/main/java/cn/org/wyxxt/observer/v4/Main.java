package cn.org.wyxxt.observer.v4;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/3 3:36 下午
 * @email jsjxzw@163.com
 */
class Child {
    private boolean cry = false;
    private Dad d = new Dad();
    private Mum m = new Mum();
    private Dog dog = new Dog();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
//        System.out.println("waked up! crying wuwuwu...");
        cry = true;
        d.feed();
        m.hug();
        dog.wang();
    }
}

class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}

class Mum {
    public void hug() {
        System.out.println("mum hugging...");
    }
}

class Dog {
    public void wang() {
        System.out.println("dog wang...");
    }
}


public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        //do something
        child.wakeUp();
    }
}