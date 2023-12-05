package strategy;

/**
 * @author zhangyibo
 * @title: StrategyTwo
 * @description: 过河拆桥 可以获取目标用户一张牌
 * @date 2023/12/5 17:16
 */
public class StealSheep implements CardStrategy {

    @Override
    public void useCard(String useUser, String targetUser) {
        System.out.println(useUser + "对" + targetUser + "使用顺手牵羊");

    }
}
