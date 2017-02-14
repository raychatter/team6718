package org.usfirst.frc.team6718.robot;

import org.usfirst.frc.team6718.robot.subsystems.ExampleSubsystem;

public abstract class CommandBase extends Command {
  public static OI oi;
  public static ExampleSubsystem driveSystem = new ExampleSubsystem();

  public static void init() {
    oi = new OI();
  }

  public CommandBase(String name) {
    super(name);
  }

  public CommandBase() {
    super();
  }
}
