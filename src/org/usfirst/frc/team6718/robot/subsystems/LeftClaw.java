package org.usfirst.frc.team6718.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LeftClaw extends Subsystem {
  public static final int LEFT_CLAW_MOTOR_PORT = 8;
  public static final int LEFT_CLOSED_LIMIT_SWITCH_PORT = 1;
  public static final int LEFT_OPEN_LIMIT_SWITCH_PORT = 3;
  private Victor leftClawMotor = new Victor(LEFT_CLAW_MOTOR_PORT);
  private DigitalInput leftClawClosed = new DigitalInput(LEFT_CLOSED_LIMIT_SWITCH_PORT);
  private DigitalInput leftClawOpen = new DigitalInput(LEFT_OPEN_LIMIT_SWITCH_PORT);

  public void close() {
    leftClawMotor.set(-0.5);
  }

  public void open() {
    leftClawMotor.set(0.5);
  }

  public void stop() {
    leftClawMotor.set(0.0);
  }

  public boolean isClosed() {
    return !leftClawClosed.get();  // limit switch is false when closed (grounded)
  }

  public boolean isOpen() {
    return !leftClawOpen.get();  // limit switch is false when closed (grounded)
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  }
}
