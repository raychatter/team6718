package org.usfirst.frc.team6718.robot.commands;

import org.usfirst.frc.team6718.robot.CommandBase;
import org.usfirst.frc.team6718.robot.Robot;
import org.usfirst.frc.team6718.robot.subsystems.DriveSystem;

/**
 *
 */
public class DriveWithJoystick extends CommandBase {
	DriveSystem m_driveSystem;

	public DriveWithJoystick() {
		// Use requires() here to declare subsystem dependencies
		m_driveSystem = DriveSystem.getInstance();
		requires(m_driveSystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		m_driveSystem.driveWithJoystick();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
