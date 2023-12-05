package strategy;

/**
 * @author zhangyibo
 * @title: StrategyThree
 * @description: 无懈可击 可以无效化目标用户的锦囊牌
 * @date 2023/12/5 17:17
 */
public class Unassailable implements CardStrategy {
    @Override
    public void useCard(String useUser, String targetUser) {
        System.out.println(useUser + "对" + targetUser + "使用无懈可击，" + "无效了" + targetUser + "的锦囊牌！");
    }
}
