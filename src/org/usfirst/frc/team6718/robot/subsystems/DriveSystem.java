package org.usfirst.frc.team6718.robot.subsystems;
import org.usfirst.frc.team6718.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6718.robot.RobotMap;

/**
 *
 */
public class DriveSystem extends Subsystem {
	private Spark frontLeftMotor = new Spark(RobotMap.FRONT_LEFT_MOTOR);
	private Spark rearLeftMotor = new Spark(RobotMap.REAR_LEFT_MOTOR);
	private Spark frontRightMotor = new Spark(RobotMap.FRONT_RIGHT_MOTOR);
	private Spark rearRightMotor = new Spark(RobotMap.REAR_RIGHT_MOTOR);
	private RobotDrive drive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
	private boolean isBackwards = false;

	public DriveSystem() {
		super();
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
	}

	/**
	 * When no other command is running let the operator drive around using the
	 * PS3 joystick.
	 */
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());
	}

	public void driveWithJoystick(Joystick stick) {
		drive.arcadeDrive(stick);
	}

	public void straight() {
		drive.arcadeDrive(1.0, 0.0);
	}

	public void turnLeft() {
		drive.arcadeDrive(0.0, 1.0);
	}

	public void stop() {
		drive.arcadeDrive(0.0, 0.0);
	}
	
	public void switchDirection() {
		if (isBackwards == false) {
			drive = new RobotDrive(frontRightMotor, rearRightMotor, frontLeftMotor, rearLeftMotor);
			drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, false);
			drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
			drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, false);
			drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, false);
			isBackwards = true;
		} else {
			drive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
			drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
			drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
			drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
			drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
			isBackwards = false;
		}
	}
}