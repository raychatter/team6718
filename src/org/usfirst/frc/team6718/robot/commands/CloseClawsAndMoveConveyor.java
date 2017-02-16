package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6718.robot.Robot;
import org.usfirst.frc.team6718.robot.subsystems.CloseClaws;
import org.usfirst.frc.team6718.robot.subsystems.ConveyorDown;

/**
 *
 */
public class CloseClawsAndMoveConveyor extends extends CommandGroup  {

  public CloseClawsAndMoveConveyor() {
    // Use requires() here to declare subsystem dependencies
    super("CloseClawsAndMoveConveyor");
    addSequential(new CloseClaws());
    addSequential(new ConveyorDown());
  }

}
