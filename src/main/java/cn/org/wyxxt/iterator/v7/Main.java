package cn.org.wyxxt.iterator.v7;


/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/5 11:49 上午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) {
        Collection_<String> list = new LinkedList_<>();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());


        //接口的调用方式
        Iterator_<String> it = list.iterator();
        while (it.hasNext()) {
            String o = it.next();
            System.out.println(o);
        }
    }
}
