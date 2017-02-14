package org.usfirst.frc.team6718.robot.commands;

import org.usfirst.frc.team6718.robot.CommandBase;
import org.usfirst.frc.team6718.robot.Robot;
import org.usfirst.frc.team6718.robot.subsystems.RightClaw;

/**
 *
 */
public class CloseRightClaw extends extends CommandBase  {

  public CloseRightClaw() {
    // Use requires() here to declare subsystem dependencies
    super("CloseRightClaw");
    requires(RightClaw.getInstance());
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    RightClaw.getInstance().close();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return RightClaw.getInstance().isClosed();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    RightClaw rightClaw = RightClaw.getInstance();
    rightClaw.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("Right Claw closing interrupted");
    end();
  }
}
