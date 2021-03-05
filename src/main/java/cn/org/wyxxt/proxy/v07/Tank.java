package cn.org.wyxxt.proxy.v07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
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
 * 想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型 Object
 * 分离代理行为和被代理对象
 * 使用jdk的动态代理
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
        Tank tank = new Tank();

        // reflection 通过二进制字节码分析类的属性和方法

        Movable m = (Movable) Proxy.newProxyInstance(
                Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHandler(tank)
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("method " + method.getName() + " start...");
//                        Object o = method.invoke(tank, args);
//                        System.out.println("method " + method.getName() + " end!");
//                        return o;
//                    }
//                }
        );
        m.move();
    }
}

class LogHandler implements InvocationHandler {

    Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + " start...");
        Object o = method.invoke(tank, args);
        System.out.println("method " + method.getName() + " end!");
        return o;
    }
}


interface Movable {
    void move();
}

