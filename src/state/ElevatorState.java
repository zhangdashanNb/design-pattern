package state;

/**
 * @author zhangyibo
 * @title: ElevatorState
 * @description: 电梯状态
 * @date 2023/12/22 16:45
 */
public interface ElevatorState {
    /**
     * 电梯开门
     */
    void openDoor();

    /**
     * 电梯关门
     */
    void closeDoor();

    /**
     * 电梯运行
     */
    void run();

    /**
     * 电梯停止
     */
    void stop();
}
