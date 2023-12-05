package observer;

/**
 * @author zhangyibo
 * @title: XiaoZhangStudent
 * @description: 勤奋帅气爱读书的小张同学
 * @date 2023/12/5 16:09
 */
public class XiaoZhangStudent implements Observer {
    @Override
    public void update(String message) {
        if ("beginClass".equals(message)) {
            System.out.println("小张同学开始读书");
        } else if ("endClass".equals(message)) {
            System.out.println("小张同学继续读书");
        }
    }
}
