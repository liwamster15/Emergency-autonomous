package frc.robot.Auto.modes;
import frc.robot.Auto.Actions.Action;

public abstract class runAction {
    public runAction(){}
    public void run(Action action){
        boolean isRunning = true;
        action.start();
        while (isRunning){
            isRunning = action.update();
        }
    action.done();
    }
}