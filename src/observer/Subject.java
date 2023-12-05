package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyibo
 * @title: Subject
 * @description: 主题接口
 * @date 2023/12/5 16:01
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者
     * @param observer 观察者
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer 观察者
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     * @param message 消息
     */
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }

}
