package frc.robot.Auto.Actions;
import frc.robot.subsystems.boxIntake;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;

public class abrircajas implements Action{
    boxIntake mBoxIntake = new boxIntake();
    double duration;
    double startTime;
    
    public abrircajas(double induration){
        duration = induration;
    }

    public void start(){
        mBoxIntake.cajasAuto(2);
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
        mBoxIntake.cajasAuto(3);

    }
}