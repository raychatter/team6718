package org.usfirst.frc.team6718.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RightClaw extends Subsystem {
  public static final int RIGHT_CLAW_MOTOR_PORT = 9;
  public static final int RIGHT_CLOSED_LIMIT_SWITCH_PORT = 2;
  public static final int RIGHT_OPEN_LIMIT_SWITCH_PORT = 4;
  private Victor rightClawMotor = new Victor(RIGHT_CLAW_MOTOR_PORT);
  private DigitalInput rightClawClosed = new DigitalInput(RIGHT_CLOSED_LIMIT_SWITCH_PORT);
  private DigitalInput rightClawOpen = new DigitalInput(RIGHT_OPEN_LIMIT_SWITCH_PORT);

  public void close() {
    rightClawMotor.set(0.5);
  }

  public void open() {
    rightClawMotor.set(-0.5);
  }

  public void stop() {
    rightClawMotor.set(0.0);
  }

  public boolean isClosed() {
    return !rightClawClosed.get();  // limit switch is false when closed (grounded)
  }

  public boolean isOpen() {
    return !rightClawOpen.get();  // limit switch is false when closed (grounded)
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  }
}
