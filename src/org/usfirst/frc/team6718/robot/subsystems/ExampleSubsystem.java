package org.usfirst.frc.team6718.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
	Joystick stick;
	RobotDrive buttah;
	Spark frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor;
	
	public static ExampleSubsystem instance;
	
	public static ExampleSubsystem getInstance() {
		if (instance == null) {
			instance = new ExampleSubsystem();
		}
		return instance;
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	private ExampleSubsystem() {
		super();
		stick = new Joystick(0);
		frontLeftMotor = new Spark(0);
		rearLeftMotor =  new Spark(1);
		frontRightMotor = new Spark(2);
		rearRightMotor = new Spark(3);		
		buttah = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
		setForwardMotorConfiguration();
	}
	
	public void drive() {
		buttah.arcadeDrive(stick);
	}
	
	public void setForwardMotorConfiguration() {
		buttah.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		buttah.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		buttah.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		buttah.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
	}
	
	public void setReverseMotorConfiguration() {
		buttah.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, false);
		buttah.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
		buttah.setInvertedMotor(RobotDrive.MotorType.kFrontRight, false);
		buttah.setInvertedMotor(RobotDrive.MotorType.kRearRight, false);
	}
}
