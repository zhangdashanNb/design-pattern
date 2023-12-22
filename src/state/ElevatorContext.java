package state;

/**
 * @author zhangyibo
 * @title: ElevatorContext
 * @description: 电梯上下文
 * @date 2023/12/22 16:49
 */
public class ElevatorContext {
    /**
     * 当前电梯状态
     */
    private ElevatorState currentState ;

    public void setState(ElevatorState state) {
        this.currentState = state;
    }

    public void openDoor() {
        this.currentState.openDoor();
    }

    public void closeDoor() {
        this.currentState.closeDoor();
    }

    public void run() {
        this.currentState.run();
    }

    public void stop() {
        this.currentState.stop();
    }
}
