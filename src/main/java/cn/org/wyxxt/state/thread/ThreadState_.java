package cn.org.wyxxt.state.thread;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/15 10:04 上午
 * @email jsjxzw@163.com
 */
public abstract class ThreadState_ {

    abstract public void move(Action input);

    abstract public void run();
}
