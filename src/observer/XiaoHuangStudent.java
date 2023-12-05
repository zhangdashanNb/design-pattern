package observer;

/**
 * @author zhangyibo
 * @title: XiaoHuangStudent
 * @description: 小黄同学
 * @date 2023/12/516:09
 */
public class XiaoHuangStudent implements Observer{
    @Override
    public void update(String message) {
        if ("beginClass".equals(message)) {
            System.out.println("小黄同学开始睡觉");
        } else if ("endClass".equals(message)) {
            System.out.println("小黄同学开始上厕所");
        }
    }
}
