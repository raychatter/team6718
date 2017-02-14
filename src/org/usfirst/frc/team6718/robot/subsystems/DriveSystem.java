package org.usfirst.frc.team6718.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSystem extends Subsystem {
	RobotDrive drive;
	Spark frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new DriveWithJoystick());
	}

	public DriveSystem() {
		// super();
		frontLeftMotor = new Spark(0);
		rearLeftMotor =  new Spark(1);
		frontRightMotor = new Spark(2);
		rearRightMotor = new Spark(3);
		drive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
	}

	public void driveWithJoystick() {
		drive.arcadeDrive(oi.getJoystick());
	}
}
