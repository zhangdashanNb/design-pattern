package strategy;

/**
 * @author zhangyibo
 * @title: Context
 * @description: 环境类
 * @date 2023/12/5 17:38
 */
public class Context {
    private CardStrategy cardStrategy;
    private SystemStrategy systemStrategy;

    public void setStrategy(CardStrategy cardStrategy) {
        this.cardStrategy = cardStrategy;
    }

    public void setStrategy(SystemStrategy systemStrategy) {
        this.systemStrategy = systemStrategy;
    }

    public void useCard(String useUser, String targetUser) {
        cardStrategy.useCard(useUser, targetUser);
    }

    public void execute(String useUser) {
        systemStrategy.execute(useUser);
    }
}
