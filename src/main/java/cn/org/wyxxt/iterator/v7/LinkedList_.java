package cn.org.wyxxt.iterator.v7;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/5 11:47 上午
 * @email jsjxzw@163.com
 */

/**
 * 范型版本
 *
 * @param <E>
 */
public class LinkedList_<E> implements Collection_<E> {

    Node head = null;
    Node tail = null;

    private class Node {
        private E o;
        Node next;

        public Node(E o) {
            this.o = o;
        }
    }

    private int size = 0;

    @Override
    public void add(E o) {
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

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator_ {

        Node currentNode = new Node(null);

        public LinkedListIterator() {
            currentNode.next = head;
        }

        @Override
        public boolean hasNext() {
            if (currentNode.next == null) return false;
            return true;
        }

        @Override
        public E next() {
            Node pre = currentNode;
            currentNode = currentNode.next;
            return pre.o;
        }
    }
}
