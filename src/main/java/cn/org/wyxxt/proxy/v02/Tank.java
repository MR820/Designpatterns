package cn.org.wyxxt.proxy.v02;

import java.util.Random;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/4 3:12 下午
 * @email jsjxzw@163.com
 */
interface Movable {
    void move();
}


public class Tank implements Movable {
    /**
     * 模拟坦克移动了多少时间
     */
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}
