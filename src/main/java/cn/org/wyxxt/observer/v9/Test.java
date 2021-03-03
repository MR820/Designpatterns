package cn.org.wyxxt.observer.v9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/3 4:45 下午
 * @email jsjxzw@163.com
 */


public class Test {
    public static void main(String[] args) {
        ButtonTest b = new ButtonTest();
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        b.buttonPressed();
    }


}

class ButtonTest {
    private List<ActionListener> actionListeners = new ArrayList<>();

    public void buttonPressed() {
        ActionEvent e = new ActionEvent(System.currentTimeMillis(), this);
        for (int i = 0; i < actionListeners.size(); i++) {
            ActionListener l = actionListeners.get(i);
            l.actionPerformed(e);
        }
    }

    public void addActionListener(ActionListener l) {
        actionListeners.add(l);
    }
}


class ActionEvent {
    long when;

    Object source;

    public ActionEvent(long timestamp, Object source) {
        super();
        this.source = source;
        this.when = timestamp;
    }

    public long getWhen() {
        return when;
    }

    public Object getSource() {
        return source;
    }


}

interface ActionListener {
    public void actionPerformed(ActionEvent e);
}

class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed!");
    }
}

class MyActionListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button pressed2!");
    }
}