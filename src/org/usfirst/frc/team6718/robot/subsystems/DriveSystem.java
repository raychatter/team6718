package org.usfirst.frc.team6718.robot.subsystems;

import org.usfirst.frc.team6718.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSystem extends Subsystem {
	public static final int FRONT_LEFT_MOTOR_PORT = 0;
	public static final int REAR_LEFT_MOTOR_PORT = 1;
	public static final int FRONT_RIGHT_MOTOR_PORT = 2;
	public static final int REAR_RIGHT_MOTOR_PORT = 3;
	private Spark frontLeftMotor = new Spark(FRONT_LEFT_MOTOR_PORT);
	private Spark rearLeftMotor = new Spark(REAR_LEFT_MOTOR_PORT);
	private Spark frontRightMotor = new Spark(FRONT_RIGHT_MOTOR_PORT);
	private Spark rearRightMotor = new Spark(REAR_RIGHT_MOTOR_PORT);
	private RobotDrive drive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);

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
}
