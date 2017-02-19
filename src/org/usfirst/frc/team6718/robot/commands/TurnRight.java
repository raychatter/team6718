package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6718.robot.Robot;
import org.usfirst.frc.team6718.robot.subsystems.DriveSystem;

/**
 *
 */
public class TurnRight extends Command {
  private double m_timeout;

  public TurnRight(double timeout) {
    // Use requires() here to declare subsystem dependencies
    super("TurnRight");
    m_timeout = timeout;
    requires(Robot.driveSystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    setTimeout(m_timeout);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.driveSystem.turnRight();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut();
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
    Robot.driveSystem.stop();
  }
}
