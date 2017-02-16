package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6718.robot.Robot;

/**
 *
 */
public class DriveWithJoystick extends Command {

	public DriveWithJoystick() {
		// Use requires() here to declare subsystem dependencies
		super("DriveWithJoystick");
		requires(Robot.driveSystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.driveSystem.driveWithJoystick(Robot.oi.getJoystick());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.driveSystem.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
