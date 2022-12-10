package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class ballOuttake {

    public TalonSRX ballIntake = new TalonSRX(Constants.BALLSconstant);

    XboxController control1 = new XboxController(0);

    public ballOuttake(){}

    
    //Intake de pelotas
    public void mBallIntake(boolean getButton){
        boolean firIntake = getButton;

        

        if(firIntake == true){
            ballIntake.set(ControlMode.PercentOutput,Constants.ballOutakeSpeed);
        }

        else{
            ballIntake.set(ControlMode.PercentOutput,0);
        }

    }
}
