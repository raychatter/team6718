package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6718.robot.Robot;
import org.usfirst.frc.team6718.robot.subsystems.DriveSystem;

/**
 *
 */
public class DriveStraight extends Command {
  private double m_timeout;

  public DriveStraight(double timeout) {
    // Use requires() here to declare subsystem dependencies
    m_timeout = timeout;
    requires(DriveSystem.getInstance());
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    setTimeout(m_timeout);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    DriveSystem.getInstance().straight();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut();
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
