package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6718.robot.Robot;

/**
 *
 */
public class CloseRightClaw extends Command  {

  public CloseRightClaw() {
    // Use requires() here to declare subsystem dependencies
    super("CloseRightClaw");
    requires(Robot.rightClaw);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.rightClaw.close();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.rightClaw.isClosed();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
     Robot.rightClaw.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("Right Claw closing interrupted");
    end();
  }
}
