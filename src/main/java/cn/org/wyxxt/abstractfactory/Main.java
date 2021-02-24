package cn.org.wyxxt.abstractfactory;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/24 11:57 上午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory f = new MagicFactory();
        Vehicle c = f.createVehicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();
    }
}
