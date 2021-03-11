package cn.org.wyxxt.bridge.v3;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/11 2:55 下午
 * @email jsjxzw@163.com
 */
public class GG {
    public void chase(MM mm) {
        Gift g = new WarmGift(new Flower());
        give(mm, g);
    }

    public void give(MM mm, Gift g) {
        System.out.println(g + "gived!");
    }
}
