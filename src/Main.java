import observer.*;
import state.*;
import strategy.*;

/**
 * @author zhangyibo
 * @title: 设计模式DEMO
 * @description: 设计模式DEMO
 * @date 2023/12/5 15:52
 */
public class Main {
    public static void main(String[] args) {
        //观察者模式执行
        observerTest();
        //策略模式执行
        strategyTest();
        //状态模式执行
        stateTest();
    }

    private static void observerTest() {
        //
        System.out.println("*************** 观察者模式DEMO开始 *************** \n \n");
        //创建具体的主题
        ClassBeginBell classBeginBell = new ClassBeginBell();
        ClassEndBell classEndBell = new ClassEndBell();

        //创建具体的观察者
        XiaoHongStudent xiaoHongStudent = new XiaoHongStudent();
        XiaoHuangStudent xiaoHuangStudent = new XiaoHuangStudent();
        XiaoZhangStudent xiaoZhangStudent = new XiaoZhangStudent();

        //将观察者注册到主题中
        classBeginBell.registerObserver(xiaoHongStudent);
        classBeginBell.registerObserver(xiaoHuangStudent);
        classBeginBell.registerObserver(xiaoZhangStudent);

        classEndBell.registerObserver(xiaoHongStudent);
        classEndBell.registerObserver(xiaoHuangStudent);
        classEndBell.registerObserver(xiaoZhangStudent);

        //触发事件
        classBeginBell.ring();
        classEndBell.ring();

        System.out.println("老师发现小黄同学不爱读书，决定让小黄同学退学。");
        //将观察者从主题中移除
        classBeginBell.removeObserver(xiaoHuangStudent);
        classEndBell.removeObserver(xiaoHuangStudent);

        //触发事件
        classBeginBell.ring();
        classEndBell.ring();
        System.out.println(" \n \n *************** 观察者模式DEMO结束 *************** \n \n");
    }

    private static void strategyTest() {
        System.out.println("*************** 策略模式DEMO开始 *************** \n \n");
        //创建具体的策略
        DismantleBridge dismantleBridge = new DismantleBridge();
        Unassailable unassailable = new Unassailable();
        StealSheep stealSheep = new StealSheep();
        Fighting fighting = new Fighting();
        GoodBye goodBye = new GoodBye();
        Exit exit = new Exit();

        //创建具体的环境
        Context zhangSan = new Context();
        Context liSi = new Context();
        //开始游戏
        zhangSan.setStrategy(fighting);
        zhangSan.execute("张三");
        liSi.setStrategy(fighting);
        liSi.execute("李四");
        //张三使用过河拆桥
        zhangSan.setStrategy(dismantleBridge);
        zhangSan.useCard("张三", "李四");
        //张三使用顺手牵羊
        zhangSan.setStrategy(stealSheep);
        zhangSan.useCard("张三", "李四");
        //李四使用无懈可击
        liSi.setStrategy(unassailable);
        liSi.useCard("李四", "张三");
        //李四发起投降
        liSi.setStrategy(goodBye);
        liSi.execute("李四");
        //李四退出游戏
        liSi.setStrategy(exit);
        liSi.execute("李四");
        //张三退出游戏
        zhangSan.setStrategy(exit);
        zhangSan.execute("张三");
        System.out.println(" \n \n *************** 策略模式DEMO结束 *************** \n \n");
    }

    private static void stateTest() {
        System.out.println("*************** 状态模式DEMO开始 *************** \n \n");
        //创建具体的环境
        ElevatorContext elevator = new ElevatorContext();
        //创建具体的状态
        OpenDoorState openDoorState = new OpenDoorState();
        CloseDoorState closeDoorState = new CloseDoorState();
        RunState runState = new RunState();
        StopState stopState = new StopState();
        //电梯初始状态为停止状态
        elevator.setState(stopState);
        System.out.println("电梯初始状态为停止状态");
        //电梯停止状态下，可以开门
        elevator.openDoor();
        //电梯停止状态下，可以关门
        elevator.closeDoor();
        //电梯停止状态下，可以运行
        elevator.run();
        //电梯停止状态下，可以停止
        elevator.stop();
        //电梯关门状态下，可以开门
        elevator.setState(closeDoorState);
        System.out.println("电梯状态切换为关门状态");
        elevator.openDoor();
        //电梯关门状态下，可以关门
        elevator.closeDoor();
        //电梯关门状态下，可以运行
        elevator.run();
        //电梯关门状态下，可以停止
        elevator.stop();
        //电梯运行状态下，可以开门
        elevator.setState(runState);
        System.out.println("电梯状态切换为运行状态");
        elevator.openDoor();
        //电梯运行状态下，可以关门
        elevator.closeDoor();
        //电梯运行状态下，可以运行
        elevator.run();
        //电梯运行状态下，可以停止
        elevator.stop();
        //电梯开门状态下，可以开门
        elevator.setState(openDoorState);
        System.out.println("电梯状态切换为开门状态");
        elevator.openDoor();
        //电梯开门状态下，可以关门
        elevator.closeDoor();
        //电梯开门状态下，可以运行
        elevator.run();
        //电梯开门状态下，可以停止
        elevator.stop();
        System.out.println(" \n \n *************** 状态模式DEMO结束 *************** \n \n");
    }
}