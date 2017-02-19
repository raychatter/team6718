package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PlaceGearCrossLineLeft extends CommandGroup{
	public PlaceGearCrossLineLeft() {
		super("PlaceGearCrossLineLeft");
		addSequential(new DriveStraight(2));
		addSequential(new Stop(1));
		addSequential(new DriveBackward(1));
		addSequential(new TurnLeft(1));
		addSequential(new DriveStraight(1));
		addSequential(new TurnRight(1));
		addSequential(new DriveStraight(2));
	}
}
