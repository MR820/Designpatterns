package cn.org.wyxxt.iterator.v6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/5 2:56 下午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        for (int i = 0; i < 15; i++) {
            c.add(new String("s" + i));
        }

        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
