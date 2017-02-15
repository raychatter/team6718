package org.usfirst.frc.team6718.robot.subsystems;

import org.usfirst.frc.team6718.robot.OI;
import org.usfirst.frc.team6718.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSystem extends Subsystem {
	private static DriveSystem instance;
	public static final int FRONT_LEFT_MOTOR_PORT = 0;
	public static final int REAR_LEFT_MOTOR_PORT = 1;
	public static final int FRONT_RIGHT_MOTOR_PORT = 2;
	public static final int REAR_RIGHT_MOTOR_PORT = 3;
	private RobotDrive drive;
	private Spark frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new DriveWithJoystick());
	}

	public DriveSystem() {
		// super();
		frontLeftMotor = new Spark(4);
		rearLeftMotor =  new Spark(5);
		frontRightMotor = new Spark(6);
		rearRightMotor = new Spark(7);
		drive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
	}

	public void driveWithJoystick() {
		drive.arcadeDrive(OI.getInstance().getJoystick());
	}

	public void straight() {
		drive.arcadeDrive(1.0, 0.0);
	}

	public void turnLeft() {
		drive.arcadeDrive(0.0, 1.0);
	}

	public static DriveSystem getInstance() {
		if (instance == null) {
			instance = new DriveSystem();
		}
		return instance;
	}
}
