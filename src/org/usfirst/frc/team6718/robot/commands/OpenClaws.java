package org.usfirst.frc.team6718.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6718.robot.Robot;
import org.usfirst.frc.team6718.robot.subsystems.LeftClaw;
import org.usfirst.frc.team6718.robot.subsystems.RightClaw;

/**
 *
 */
public class OpenClaws extends extends CommandGroup  {

  public OpenClaws() {
    // Use requires() here to declare subsystem dependencies
    super("OpenClaws");
    addParallel(new OpenLeftClaw());
    addParallel(new OpenRightClaw());
  }

}
