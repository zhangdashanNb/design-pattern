package state;

/**
 * @author zhangyibo
 * @title: OpenDoorState
 * @description: 电梯开门状态
 * @date 2023/12/22 16:46
 */
public class OpenDoorState implements ElevatorState {
    @Override
    public void openDoor() {
        System.out.println("电梯门已经打开了，不需要再次打开");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门已经打开了，正在关闭");
    }

    @Override
    public void run() {
        System.out.println("电梯门已经打开了，不能运行");
    }

    @Override
    public void stop() {
        System.out.println("电梯门已经打开了，不能停止");
    }
}
