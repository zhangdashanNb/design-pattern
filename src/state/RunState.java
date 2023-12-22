package state;

/**
 * @author zhangyibo
 * @title: RunState
 * @description: 电梯运行状态
 * @date 2023/12/22 16:47
 */
public class RunState implements ElevatorState {
    @Override
    public void openDoor() {
        System.out.println("电梯正在运行，不能开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯正在运行，不能关门");
    }

    @Override
    public void run() {
        System.out.println("电梯正在运行，不需要再次运行");
    }

    @Override
    public void stop() {
        System.out.println("电梯正在运行，正在停止");
    }
}
