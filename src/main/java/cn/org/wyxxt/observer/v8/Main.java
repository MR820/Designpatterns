package cn.org.wyxxt.observer.v8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/3 3:36 下午
 * @email jsjxzw@163.com
 * <p>
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 观察者只和事件打交道，不和事件源打交道，和事件源解耦合
 * 事件也可以形成继承体系
 * <p>
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 观察者只和事件打交道，不和事件源打交道，和事件源解耦合
 * 事件也可以形成继承体系
 * <p>
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 观察者只和事件打交道，不和事件源打交道，和事件源解耦合
 * 事件也可以形成继承体系
 * <p>
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 观察者只和事件打交道，不和事件源打交道，和事件源解耦合
 * 事件也可以形成继承体系
 * <p>
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 观察者只和事件打交道，不和事件源打交道，和事件源解耦合
 * 事件也可以形成继承体系
 * <p>
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 观察者只和事件打交道，不和事件源打交道，和事件源解耦合
 * 事件也可以形成继承体系
 */

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 * 观察者只和事件打交道，不和事件源打交道，和事件源解耦合
 * 事件也可以形成继承体系
 */

/**
 * hook function callback function 钩子函数本质上就是Observer
 */
class Child {
    private boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
        observers.add((e) -> {//钩子函数
            System.out.println("ppp");
        });
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
//        System.out.println("waked up! crying wuwuwu...");
        cry = true;

        wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis(), "bed", this);

        for (Observer o : observers) {
            o.actionOnWakeUp(event);
        }
    }
}

abstract class Event<T> {
    abstract T getSource();
}

//事件类 fireEvent
class wakeUpEvent extends Event<Child> {

    long timestamp;
    String loc;
    Child source;

    public wakeUpEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Child getSource() {
        return source;
    }
}


interface Observer {
    void actionOnWakeUp(wakeUpEvent event);
}


class Dad implements Observer {
    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
//        event.getSource();
        feed();
    }
}

class Mum implements Observer {
    public void hug() {
        System.out.println("mum hugging...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        hug();
    }
}

class Dog implements Observer {
    public void wang() {
        System.out.println("dog wang...");
    }

    @Override
    public void actionOnWakeUp(wakeUpEvent event) {
        wang();
    }
}


public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        //do something
        child.wakeUp();
    }
}