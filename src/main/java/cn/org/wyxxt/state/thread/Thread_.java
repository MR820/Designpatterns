package cn.org.wyxxt.state.thread;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/15 10:03 上午
 * @email jsjxzw@163.com
 */
public class Thread_ {
    ThreadState_ state;

    void move(Action input) {
        state.move(input);
    }

    void run() {
        state.run();
    }
}
