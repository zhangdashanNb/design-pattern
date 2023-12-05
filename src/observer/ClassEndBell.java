package observer;

/**
 * @author zhangyibo
 * @title: ClassEndBell
 * @description: 下课铃
 * @date 2023/12/5 16:07
 */
public class ClassEndBell extends Subject {
    public void ring() {
        System.out.println("下课铃响了");
        notifyObservers("endClass");
    }
}
