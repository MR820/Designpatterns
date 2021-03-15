package cn.org.wyxxt.state.v2;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/15 9:44 上午
 * @email jsjxzw@163.com
 */
public class MM {
    String name;


    MMState state;

    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }
}
