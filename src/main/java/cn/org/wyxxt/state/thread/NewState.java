package cn.org.wyxxt.state.thread;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/15 10:06 上午
 * @email jsjxzw@163.com
 */
public class NewState extends ThreadState_ {
    private Thread_ t;

    public NewState(Thread_ t) {
        this.t = t;
    }

    @Override
    public void move(Action input) {
        if (input.msg == "start") {
            t.state = new RunningState(t);
        }
    }

    @Override
    public void run() {

    }
}
