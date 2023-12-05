package strategy;

/**
 * @author zhangyibo
 * @title: Strategy
 * @description: 卡牌策略接口
 * @date 2023/12/5 17:16
 */
public interface CardStrategy {
    void useCard(String useUser, String targetUser);
}
