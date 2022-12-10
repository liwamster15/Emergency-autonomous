package frc.robot.Auto.Actions;
import frc.robot.subsystems.Drive;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Timer;

public class Backwards implements Action{
    Drive mAutoDrive = new Drive();
    double duration;
    double startTime;
    
    public Backwards(double induration){
        duration = induration;
    }

    public void start(){
        mAutoDrive.motoresAuto(-.5,-.5,.5,.5);
        startTime = Timer.getFPGATimestamp();


    }
    public boolean update(){
        if (Timer.getFPGATimestamp()-startTime >= duration){
            return false;
        }
        else{
            return true;
        }
    }
    public void done(){
        mAutoDrive.motoresAuto(0, 0, 0, 0);

    }
}