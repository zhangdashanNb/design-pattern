package strategy;

/**
 * @author zhangyibo
 * @title: GoodBye
 * @description: 发起投降
 * @date 2023/12/5 17:44
 */
public class GoodBye implements SystemStrategy{
    @Override
    public void execute(String useUser) {
        System.out.println(useUser + "觉得你开挂了，不玩了");
    }
}
