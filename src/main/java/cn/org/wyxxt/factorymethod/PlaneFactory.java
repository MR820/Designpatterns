package cn.org.wyxxt.factorymethod;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/24 3:06 下午
 * @email jsjxzw@163.com
 */
public class PlaneFactory {
    public Movable create() {
        System.out.println("a plane created!");
        return new Plane();
    }
}
