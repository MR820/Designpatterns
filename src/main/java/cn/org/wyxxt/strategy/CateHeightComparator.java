package cn.org.wyxxt.strategy;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/23 6:27 下午
 * @email jsjxzw@163.com
 */
public class CateHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height < o2.height) return -1;
        else if (o1.height > o2.height) return 1;
        else return 0;
    }
}
