package cn.org.wyxxt.state.thread;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/15 10:08 上午
 * @email jsjxzw@163.com
 */

public class RunningState extends ThreadState_ {
  private Thread_ t;

  public RunningState(Thread_ t) {
    this.t = t;
  }

  @Override
  public void move(Action input) {

  }

  @Override
  public void run() {

  }
}
