package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6718.robot.commands.DriveStraight;
import org.usfirst.frc.team6718.robot.commands.TurnLeft;

public class DriveInASquare extends CommandGroup {

  public DriveInASquare() {
    super("DriveInASquare");
    addSequential(new DriveStraight(1));
    addSequential(new TurnLeft(1));
    addSequential(new DriveStraight(1));
    addSequential(new TurnLeft(1));
    addSequential(new DriveStraight(1));
    addSequential(new TurnLeft(1));
    addSequential(new DriveStraight(1));
  }
}