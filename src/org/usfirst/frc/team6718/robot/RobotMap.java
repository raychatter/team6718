package org.usfirst.frc.team6718.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

  // Motors
  public static final int FRONT_LEFT_MOTOR = 0;
  public static final int REAR_LEFT_MOTOR = 1;
  public static final int FRONT_RIGHT_MOTOR = 2;
  public static final int REAR_RIGHT_MOTOR = 3;
  public static final int CONVEYOR_MOTOR = 6;
  public static final int RIGHT_CLAW_MOTOR = 8;
  public static final int LEFT_CLAW_MOTOR = 9;

  // DIO (Digital I/O)
  public static final int TOP_SWITCH = 9;
  public static final int BOTTOM_SWITCH = 0;
  public static final int RIGHT_OPEN_SWITCH = 6;
  public static final int RIGHT_CLOSED_SWITCH = 7;
  public static final int LEFT_OPEN_SWITCH = 2;
  public static final int LEFT_CLOSED_SWITCH = 3;

  // Joystick buttons
//  public static final int DRIVE_SQUARE_BUTTON = 7;
//  public static final int CLAWS_CLOSE_AND_CONVEYOR_BUTTON = 8;
  public static final int CONVEYOR_DOWN_BUTTON = 9;
  public static final int CONVEYOR_UP_BUTTON = 10;
  public static final int CLAWS_OPEN_BUTTON = 11;
  public static final int CLAWS_CLOSE_BUTTON = 12;
  public static final int REVERSE_BUTTON = 5;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
