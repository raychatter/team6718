package org.usfirst.frc.team6718.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Conveyor extends Subsystem {
  public static final int CONVEYOR_MOTOR_PORT = 6;
  public static final int TOP_LIMIT_SWITCH_PORT = 0;
  public static final int BOTTOM_LIMIT_SWITCH_PORT = 1;
  private Victor conveyorMotor = new Victor(CONVEYOR_MOTOR_PORT);
  private DigitalInput conveyorAtTop = new DigitalInput(TOP_LIMIT_SWITCH_PORT);
  private DigitalInput conveyorAtBottom = new DigitalInput(BOTTOM_LIMIT_SWITCH_PORT);

  public void moveToBottom() {
    conveyorMotor.set(0.5);
  }

  public void moveToTop() {
    conveyorMotor.set(-0.5);
  }

  public void stop() {
    conveyorMotor.set(0.0);
  }

  public boolean conveyorAtBottom() {
    return !conveyorAtBottom.get();  // limit switch is false when closed (grounded)
  }

  public boolean conveyorAtTop() {
    return !conveyorAtTop.get();  // limit switch is false when closed (grounded)
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  }
}
