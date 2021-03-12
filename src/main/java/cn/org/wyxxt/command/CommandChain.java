package cn.org.wyxxt.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/12 11:58 上午
 * @email jsjxzw@163.com
 */
public class CommandChain extends Command {
    List<Command> commands = new ArrayList<>();


    public void add(Command c) {
        commands.add(c);
        doit();
    }

    @Override
    public void doit() {
        Command c = commands.get(commands.size() - 1);
        c.doit();
    }

    @Override
    public void undo() {
        Command c = commands.get(commands.size() - 1);
        commands.remove(commands.size() - 1);
        c.undo();
    }
}
