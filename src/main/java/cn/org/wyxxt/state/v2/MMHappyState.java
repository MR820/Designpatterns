package cn.org.wyxxt.state.v2;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/15 9:48 上午
 * @email jsjxzw@163.com
 */
public class MMHappyState extends MMState {

    @Override
    void smile() {
        System.out.println("happy smile");
    }

    @Override
    void cry() {
        System.out.println("happy cry");
    }

    @Override
    void say() {
        System.out.println("happy say");
    }
}
