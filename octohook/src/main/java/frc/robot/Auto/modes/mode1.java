package frc.robot.subsystems.Auto.modes;
import frc.robot.subsystems.Auto.Actions.*;

public class mode1 extends runAction{
  
   public void routine(){
    
      run(new abrircajas(2));
      run(new cerrarcajas(2));
      

   
}}