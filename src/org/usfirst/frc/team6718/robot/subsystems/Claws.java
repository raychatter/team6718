package org.usfirst.frc.team6718.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Claws extends Subsystem {
  public static final int LEFT_CLAW_MOTOR_PORT = 8;
  public static final int RIGHT_CLAW_MOTOR_PORT = 9;
  public static final int LEFT_LIMIT_SWITCH_PORT = 1;
  public static final int RIGHT_LIMIT_SWITCH_PORT = 2;
  private Victor leftClawMotor = new Victor(LEFT_CLAW_MOTOR_PORT);
  private Victor rightClawMotor = new Victor(RIGHT_CLAW_MOTOR_PORT);
  private DigitalInput leftClawClosed = new DigitalInput(LEFT_LIMIT_SWITCH_PORT);
  private DigitalInput rightClawClosed = new DigitalInput(RIGHT_LIMIT_SWITCH_PORT);

  public void close() {
    leftClawMotor.set(-0.5);
    rightClawMotor.set(0.5);
  }

  public void open() {
    leftClawMotor.set(0.5);
    rightClawMotor.set(-0.5);
  }

  public void stopLeft() {
    leftClawMotor.set(0.0);
  }

  public void stopRight() {
    rightClawMotor.set(0.0);
  }

  public boolean leftIsClosed() {
    return !leftClawClosed.get();  // limit switch is false when closed (grounded)
  }

  public boolean rightIsClosed() {
    return !rightClawClosed.get();  // limit switch is false when closed (grounded)
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  }
}
