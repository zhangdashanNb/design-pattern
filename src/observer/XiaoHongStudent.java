package observer;

/**
 * @author zhangyibo
 * @title: XiaoHongStudent
 * @description: 小红同学
 * @date 2023/12/5 16:07
 */
public class XiaoHongStudent implements Observer {
    @Override
    public void update(String message) {
        if ("beginClass".equals(message)) {
            System.out.println("小红同学开始读书");
        } else if ("endClass".equals(message)) {
            System.out.println("小红同学开始睡觉");
        }
    }
}
