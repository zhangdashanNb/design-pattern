package strategy;

/**
 * @author zhangyibo
 * @title: Fighting
 * @description: 开始游戏
 * @date 2023/12/5 17:46
 */
public class Fighting implements SystemStrategy{
    @Override
    public void execute(String useUser) {
        System.out.println(useUser + "兴致勃勃的进入了游戏");
    }
}
