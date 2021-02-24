package cn.org.wyxxt.factorymethod;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/24 11:57 上午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) {
        Movable m = new PlaneFactory().create();
        m.go();
    }
}
