package cn.org.wyxxt.factorymethod;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/24 1:50 下午
 * @email jsjxzw@163.com
 */
public class Broom implements Movable {
    @Override
    public void go() {
        System.out.println("Broom flying chuachuachua...");
    }
}
