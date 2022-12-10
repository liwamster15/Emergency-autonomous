package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.XboxController;

import java.util.FormatFlagsConversionMismatchException;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants;

public class boxIntake extends SubsystemBase{
    //motores
    public TalonSRX intake1 = new TalonSRX(Constants.INT1constant);
    public TalonSRX intake2 = new TalonSRX(Constants.INT2constant);

    XboxController control1 = new XboxController(0);
    
    //constructor
    public boxIntake(){}

    //Intake de cajas
    /*public void mBoxIntake(boolean getButton){
        boolean Intake = getButton;

        if(Intake == true){
            intake1.set(ControlMode.PercentOutput,Constants.intakeSpeed);
            intake2.set(ControlMode.PercentOutput,Constants.intakeSpeed);
        }
        else{
            intake1.set(ControlMode.PercentOutput,0);
            intake2.set(ControlMode.PercentOutput,0);
        }

    }*/

    //Para expulsar cajas
   /* public void mBoxOutake(double getRTrigger, double getLTrigger){
        double boxOutake = getRTrigger;
        double boxIntake = getLTrigger;

        if( boxOutake > 1 && boxIntake < 1){
            intake1.set(ControlMode.PercentOutput, Constants.outakeSpeed);
            intake2.set(ControlMode.PercentOutput, -Constants.outakeSpeed);
        }
        else if( boxIntake > 1 && boxOutake < 1){
            intake1.set(ControlMode.PercentOutput, -Constants.outakeSpeed);
            intake2.set(ControlMode.PercentOutput, Constants.outakeSpeed);  
        }
        else{
            intake1.set(ControlMode.PercentOutput, 0);
            intake2.set(ControlMode.PercentOutput, 0);
        }
    }*/

    public void getBox(double speedBox){
        

        if(speedBox > 0.15){
            intake1.set(ControlMode.PercentOutput, Constants.outakeSpeed);
            intake2.set(ControlMode.PercentOutput, -Constants.outakeSpeed);
        }
        else if(speedBox < -0.15){
            intake1.set(ControlMode.PercentOutput, -Constants.outakeSpeed);
            intake2.set(ControlMode.PercentOutput, Constants.outakeSpeed);
        }
        else{
            intake1.set(ControlMode.PercentOutput, 0);
            intake2.set(ControlMode.PercentOutput, 0);
        }
    }
    
}
