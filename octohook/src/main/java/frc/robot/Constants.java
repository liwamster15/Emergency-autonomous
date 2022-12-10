// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int FRconstant = 1;
    public static final int BRconstant = 2;
    public static final int FLconstant = 3;
    public static final int BLconstant = 4;
    public static final int BALLSconstant = 5;
    public static final int INT1constant = 6;
    public static final int INT2constant = 7;

    public static final XboxController control1 = new XboxController(0);
    public static final XboxController control2 = new XboxController(1);
    
    public static final double intakeSpeed = 0.5;
    public static final double outakeSpeed = -0.5;
    public static final double ballIntakeSpeed = 0.744616569656301;
    public static final double ballOutakeSpeed = 0.7436920416501;

}
