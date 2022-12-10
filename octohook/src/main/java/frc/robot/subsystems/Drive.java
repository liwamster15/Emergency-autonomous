// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

import java.util.FormatFlagsConversionMismatchException;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants;


public class Drive extends SubsystemBase {
//ID de los motores
    

   //Variables
    double turn = 0;
    boolean invert = false;
    boolean BButton = false;

   //Constante de velocidad aditiva
   final double additiveSpeed = 0.04;
  
  //variable
    double motorFR = 0;
    double motorBR = 0;
    double motorFL = 0;
    double motorBL = 0;
  
    double finalFR = 0;
    double finalBR = 0;
    double finalFL = 0;
    double finalBL = 0;

     
    //Motores
    


  /** Creates a new ExampleSubsystem. */
  public Drive() {}
  int FRID = 1;
    int BRID = 2;
    int FLID = 3;
    int BLID = 4;    
  
  public TalonSRX motorFrontRight = new TalonSRX(FRID); 
  public TalonSRX motorBackRight = new TalonSRX(BRID); 
  public TalonSRX motorFrontLeft = new TalonSRX(FLID); 
  public TalonSRX motorBackLeft = new TalonSRX(BLID); 
  
  
  //Invertir frente
 
  public void invert (boolean BButton){
      boolean invert = false; 
      BButton = invert;
      if(BButton = true){
        invert = !invert;
      }
    
    if (invert == false){
      FRID = 1;
      BRID = 2;
      FLID = 3;
      BLID = 4;
    }
    else if(invert == true){
      FRID = 4;
      BRID = 3;
      FLID = 2;
      BLID = 1;
    }
  }
  


  public void mDrive(double getFixedspeed, double getFixedTurn){

    double motores = getFixedTurn;
    double speed = getFixedspeed;
    
    
  
    motorFR = speedRamp(motorFR, motores);
    motorBR = speedRamp(motorFR, motores);
    motorFL = speedRamp(motorFL, motores);
    motorBL = speedRamp(motorBL, motores);

    finalFR = (motorFR - speed);
    finalBR = (motorBR - speed);
    finalFL = (motorFL + speed);
    finalBL = (motorBL + speed);
    


    motorFrontRight.set(ControlMode.PercentOutput, finalFR);
    motorBackRight.set(ControlMode.PercentOutput, finalBR);
    motorFrontLeft.set(ControlMode.PercentOutput, finalFL);
    motorBackLeft.set(ControlMode.PercentOutput,  finalBL);
  

   
  }

  //Motores para autónomo 
  public void motoresAuto(double auto_finalFR, double auto_finalBR, 
    double auto_finalFL, double auto_finalBL){
      motorFrontRight.set(ControlMode.PercentOutput, auto_finalFR);
      motorBackRight.set(ControlMode.PercentOutput, auto_finalBR);
      motorFrontLeft.set(ControlMode.PercentOutput, auto_finalFL);
      motorBackLeft.set(ControlMode.PercentOutput,  auto_finalBL);
  }

  //sensibilidad
  public double deadZone (double joystick_axis){
    if (joystick_axis > 0.2) 
      return joystick_axis;
    else if (joystick_axis < 0.2)
      return 0;
    return 0;
  }

  //Speedramp
  private double speedRamp (double currentSpeed, double targetSpeed){
    if( Math.abs( (Math.abs(targetSpeed) - Math.abs(currentSpeed) ) ) < additiveSpeed) 
      return targetSpeed;
    if( currentSpeed < targetSpeed ) 
      return currentSpeed + additiveSpeed;
    else if( currentSpeed > targetSpeed ) 
      return currentSpeed - additiveSpeed;
    return 0;
    }

   
    
  @Override
  public void periodic() {
    
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
