package cn.org.wyxxt.command;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/12 11:06 上午
 * @email jsjxzw@163.com
 */
public class InsertCommand extends Command {
    Content c;
    String strToInsert = "http://wyxxt.org.cn";

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.msg = c.msg + strToInsert;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() - strToInsert.length());
    }
}
