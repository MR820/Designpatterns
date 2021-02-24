package cn.org.wyxxt.factorymethod;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/24 1:56 下午
 * @email jsjxzw@163.com
 */
public class CarFactory {
    public Car create() {
        System.out.println("a car created!");
        return new Car();
    }
}
