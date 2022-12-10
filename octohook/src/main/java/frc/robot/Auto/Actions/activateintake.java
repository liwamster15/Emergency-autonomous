package frc.robot.Auto.Actions;
import frc.robot.subsystems.ballIntake;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Timer;

public class activateintake implements Action{
    ballIntake mIntake = new ballIntake();
    double duration;
    double startTime;
    
    public activateintake(double induration){
        duration = induration;
    }

    public void start(){
        mIntake.Intakeauto(.7); //Parecen ser velocidades
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
        mIntake.Intakeauto(0);

    }
}