package cn.org.wyxxt.command;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/12 11:03 上午
 * @email jsjxzw@163.com
 */
public abstract class Command {
    public abstract void doit(); //exec run

    public abstract void undo();


}
