package cn.org.wyxxt.proxy.v06;

import java.util.Random;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/4 3:12 下午
 * @email jsjxzw@163.com
 */

/**
 * benchmark 性能测试
 * 使用代理
 * 各种代理
 * 如何使用代理的各种组合
 * 静态代理  越来越像decorator了
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
        new TankLogProxy(
                new TankTimeProxy(
                        new Tank()
                )
        ).move();
    }
}

/**
 * 慎用继承
 */
class TankTimeProxy implements Movable {

    Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements Movable {

    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        m.move();
        System.out.println("stopped!");
    }
}

interface Movable {
    void move();
}

