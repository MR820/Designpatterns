package cn.org.wyxxt.iterator.v3;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/5 11:47 上午
 * @email jsjxzw@163.com
 */
public class LinkedList_ implements Collection_ {

    Node head = null;
    Node tail = null;

    private class Node {
        private Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }
    }

    private int size = 0;

    @Override
    public void add(Object o) {
        Node n = new Node(o);
        n.next = null;
        if (head == null) {
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
        size++;
    }


    @Override
    public int size() {
        return size;
    }
}
