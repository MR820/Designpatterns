package cn.org.wyxxt.iterator.v4;


/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/5 11:49 上午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) {
        Collection_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(new String("s" + i));
        }
        System.out.println(list.size());

        ArrayList_ al = (ArrayList_) list;
        for (int i = 0; i < al.size(); i++) {
            //如果用这种遍历方式，就不能实现通用了

        }
    }
}
