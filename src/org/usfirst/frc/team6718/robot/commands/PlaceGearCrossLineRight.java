package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PlaceGearCrossLineRight extends CommandGroup{
	public PlaceGearCrossLineRight() {
		super("PlaceGearCrossLineRight");
		addSequential(new DriveStraight(2));
		addSequential(new Stop(1));
		addSequential(new DriveBackward(1));
		addSequential(new TurnRight(1));
		addSequential(new DriveStraight(1));
		addSequential(new TurnLeft(1));
		addSequential(new DriveStraight(2));
	}
}
