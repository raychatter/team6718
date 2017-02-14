package org.usfirst.frc.team6718.robot.commands;

import org.usfirst.frc.team6718.robot.CommandBase;
import org.usfirst.frc.team6718.robot.Robot;
import org.usfirst.frc.team6718.robot.subsystems.LeftClaw;

/**
 *
 */
public class CloseLeftClaw extends extends CommandBase  {

  public CloseLeftClaw() {
    // Use requires() here to declare subsystem dependencies
    super("CloseLeftClaw");
    requires(LeftClaw.getInstance());
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    LeftClaw.getInstance().close();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return LeftClaw.getInstance().isClosed();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    LeftClaw leftClaw = LeftClaw.getInstance();
    leftClaw.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("Left Claw closing interrupted");
    end();
  }
}
