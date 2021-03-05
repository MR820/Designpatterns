package cn.org.wyxxt.proxy.v05;

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
        new TankTimeProxy(new Tank()).move();
        new TankLogProxy(new Tank()).move();
    }
}

/**
 * 慎用继承
 */
class TankTimeProxy implements Movable {

    Tank tank;

    public TankTimeProxy(Tank t) {
        this.tank = t;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements Movable {
    Tank tank;

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        tank.move();
        System.out.println("stopped!");
    }
}

interface Movable {
    void move();
}

