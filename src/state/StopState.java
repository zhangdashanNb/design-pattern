package state;

/**
 * @author zhangyibo
 * @title: StopState
 * @description: 电梯停止状态
 * @date 2023/12/22 16:48
 */
public class StopState implements ElevatorState {
    @Override
    public void openDoor() {
        System.out.println("电梯已经停止了，正在打开");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯已经停止了，正在关闭");
    }

    @Override
    public void run() {
        System.out.println("电梯已经停止了，正在运行");
    }

    @Override
    public void stop() {
        System.out.println("电梯已经停止了，不需要再次停止");
    }
}
