package state;

/**
 * @author zhangyibo
 * @title: CloseDoorState
 * @description: 电梯关门状态
 * @date 2023/12/22 16:47
 */
public class CloseDoorState implements ElevatorState {
    @Override
    public void openDoor() {
        System.out.println("电梯门已经关闭了，正在打开");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门已经关闭了，不需要再次关闭");
    }

    @Override
    public void run() {
        System.out.println("电梯门已经关闭了，正在运行");
    }

    @Override
    public void stop() {
        System.out.println("电梯门已经关闭了，正在停止");
    }
}
