package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6718.robot.Robot;

/**
 *
 */
public class CloseLeftClaw extends Command  {

  public CloseLeftClaw() {
    // Use requires() here to declare subsystem dependencies
    super("CloseLeftClaw");
    requires(Robot.leftClaw);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.leftClaw.close();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.leftClaw.isClosed();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
     Robot.leftClaw.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("Left Claw closing interrupted");
    end();
  }
}
