package cn.org.wyxxt.proxy.v03;

import java.util.Random;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/4 3:12 下午
 * @email jsjxzw@163.com
 */

/**
 * benchmark 性能测试
 */

public class Tank implements Movable {
    /**
     * 模拟坦克移动了多少时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

/**
 * 慎用继承
 */
class Tank2 extends Tank {
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

interface Movable {
    void move();
}

