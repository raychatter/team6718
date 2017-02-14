package org.usfirst.frc.team6718.robot.commands;

import org.usfirst.frc.team6718.robot.CommandBase;

import org.usfirst.frc.team6718.robot.Robot;
import org.usfirst.frc.team6718.robot.subsystems.Claws;

/**
 *
 */
public class CloseClaws extends extends CommandGroup  {

  public CloseClaws() {
    // Use requires() here to declare subsystem dependencies
    super("CloseClaws");
    requires(Claws.getInstance());
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Claws.getInstance().close();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Claws.getInstance().leftIsClosed() && Claws.getInstance().rightIsClosed();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Claws claws = Claws.getInstance();
    claws.stopLeft();
    claws.stopRight();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("Claw closing interrupted");
    end();
  }
}
