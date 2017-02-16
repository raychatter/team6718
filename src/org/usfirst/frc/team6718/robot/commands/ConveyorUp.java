package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6718.robot.Robot;

/**
 *
 */
public class ConveyorUp extends Command  {

  public ConveyorUp() {
    // Use requires() here to declare subsystem dependencies
    super("ConveyorUp");
    requires(Robot.conveyor);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.conveyor.moveToTop();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return Robot.conveyor.conveyorAtTop();
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
    System.out.println("Conveyor moving up interrupted");
    end();
  }
}
