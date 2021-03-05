package cn.org.wyxxt.proxy.v01;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/4 3:09 下午
 * @email jsjxzw@163.com
 */

import java.util.Random;

/**
 * 记录坦克的移动时间
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
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
