package cn.org.wyxxt.command;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/12 11:08 上午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) {
        Content c = new Content("xingzhiwei");

        Command insertCommand = new InsertCommand(c);
        insertCommand.doit();
        System.out.println(c.msg);
        insertCommand.undo();
        System.out.println(c.msg);
        Command copyCommand = new CopyCommand(c);
        copyCommand.doit();
        System.out.println(c.msg);
        copyCommand.undo();
        System.out.println(c.msg);

        Command deleteCommand = new DeleteCommand(c);
        deleteCommand.doit();
        System.out.println(c.msg);
        deleteCommand.undo();
        System.out.println(c.msg);
    }
}
