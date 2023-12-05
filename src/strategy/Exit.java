package strategy;

/**
 * @author zhangyibo
 * @title: Exit
 * @description: 退出游戏
 * @date 2023/12/5 17:47
 */
public class Exit implements SystemStrategy{
    @Override
    public void execute(String useUser) {
        System.out.println(useUser + "退出了游戏");
    }
}
