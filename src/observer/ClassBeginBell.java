package observer;

/**
 * @author zhangyibo
 * @title: ClassBeginBell
 * @description: 上课铃
 * @date 2023/12/5 16:05
 */
public class ClassBeginBell extends Subject {
    public void ring() {
        System.out.println("上课铃响了");
        notifyObservers("beginClass");
    }
}
