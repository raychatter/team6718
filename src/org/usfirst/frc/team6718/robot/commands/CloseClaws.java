package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6718.robot.Robot;
import org.usfirst.frc.team6718.robot.subsystems.LeftClaw;
import org.usfirst.frc.team6718.robot.subsystems.RightClaw;

/**
 *
 */
public class CloseClaws extends CommandGroup  {

  public CloseClaws() {
    // Use requires() here to declare subsystem dependencies
    super("CloseClaws");
    addParallel(new CloseLeftClaw());
    addParallel(new CloseRightClaw());
  }

}
