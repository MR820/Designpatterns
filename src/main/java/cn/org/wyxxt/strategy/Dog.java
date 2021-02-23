package cn.org.wyxxt.strategy;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/2/23 4:15 下午
 * @email jsjxzw@163.com
 */
public class Dog implements Comparable<Dog> {
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

    @Override
    public int compareTo(Dog d) {
        if (this.food < d.food) return -1;
        else if (this.food > d.food) return 1;
        else return 0;
    }
}
