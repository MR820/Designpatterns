package cn.org.wyxxt.TemplateMethod;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/12 3:46 下午
 * @email jsjxzw@163.com
 * <p>
 * 模版方法，钩子函数
 */
public class Main {
    public static void main(String[] args) {
        F f = new C1();
        f.m();
    }
}

abstract class F {
    void m() {
        op1();
        op2();
    }

    abstract void op1();

    abstract void op2();
}


class C1 extends F {

    @Override
    void op1() {
        System.out.println("op1");
    }

    @Override
    void op2() {
        System.out.println("op2");
    }
}