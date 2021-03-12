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

//        Command insertCommand = new InsertCommand(c);
//        insertCommand.doit();
//        System.out.println(c.msg);
//        insertCommand.undo();
//        System.out.println(c.msg);
//        Command copyCommand = new CopyCommand(c);
//        copyCommand.doit();
//        System.out.println(c.msg);
//        copyCommand.undo();
//        System.out.println(c.msg);
//
//        Command deleteCommand = new DeleteCommand(c);
//        deleteCommand.doit();
//        System.out.println(c.msg);
//        deleteCommand.undo();
//        System.out.println(c.msg);


        /**
         List<Command> commands = new ArrayList<>();
         commands.add(new DeleteCommand(c));
         commands.add(new InsertCommand(c));
         commands.add(new CopyCommand(c));
         commands.add(new DeleteCommand(c));

         for (Command comm : commands) {
         comm.doit();
         }

         System.out.println(c.msg);

         for (int i = commands.size() - 1; i >= 0; i--) {
         commands.get(i).undo();
         }
         System.out.println(c.msg);
         */

        CommandChain chain = new CommandChain();
        chain.add(new InsertCommand(c));
        System.out.println(c.msg);
        chain.add(new CopyCommand(c));
        System.out.println(c.msg);
        chain.undo();
        System.out.println(c.msg);
        chain.add(new DeleteCommand(c));
        System.out.println(c.msg);
        chain.undo();
        System.out.println(c.msg);
        chain.undo();
        System.out.println(c.msg);
    }
}
