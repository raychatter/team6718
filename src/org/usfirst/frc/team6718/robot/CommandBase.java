package org.usfirst.frc.team6718.robot;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6718.robot.subsystems.DriveSystem;

public abstract class CommandBase extends Command {
  public static OI oi;
  public static DriveSystem driveSystem = new DriveSystem();

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
