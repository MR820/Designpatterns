package cn.org.wyxxt.strategy;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/23 4:15 下午
 * @email jsjxzw@163.com
 */
public class Dog {
    int food;

    public Dog(int food) {
        this.food = food;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }

}
