package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6718.robot.Robot;

/**
 *
 */
public class ConveyorDown extends Command  {

  public ConveyorDown() {
    // Use requires() here to declare subsystem dependencies
    super("ConveyorDown");
    requires(Robot.conveyor);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.conveyor.moveToBottom();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.conveyor.conveyorAtBottom();
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
     Robot.conveyor.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    System.out.println("Conveyor moving down interrupted");
    end();
  }
}
