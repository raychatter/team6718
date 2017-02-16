/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team6718.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The claw subsystem is a simple system with a motor for opening and closing.
 * If using stronger motors, you should probably use a sensor so that the motors
 * don't stall.
 */
public class RightClaw extends Subsystem {
  public static final int RIGHT_CLAW_MOTOR_PORT = 8;
  public static final int RIGHT_CLOSED_LIMIT_SWITCH_PORT = 7;
  public static final int RIGHT_OPEN_LIMIT_SWITCH_PORT = 6;
  private Victor motor = new Victor(RIGHT_CLAW_MOTOR_PORT);
  private DigitalInput rightClawClosed = new DigitalInput(RIGHT_CLOSED_LIMIT_SWITCH_PORT);
  private DigitalInput rightClawOpen = new DigitalInput(RIGHT_OPEN_LIMIT_SWITCH_PORT);

  public RightClaw() {
    super();

    // Let's show everything on the LiveWindow
    LiveWindow.addActuator("RightClaw", "Motor", motor);
    LiveWindow.addActuator("RightClaw", "Limit Switch", rightClawOpen);
  }

  @Override
  public void initDefaultCommand() {
  }

  public void log() {
  }

  /**
   * Set the claw motor to move in the open direction.
   */
  public void open() {
    motor.set(0.5);
  }

  /**
   * Set the claw motor to move in the close direction.
   */
  public void close() {
    motor.set(-0.5);
  }

  /**
   * Stops the claw motor from moving.
   */
  public void stop() {
    motor.set(0.0);
  }

  public boolean isClosed() {
    return !rightClawClosed.get();  // limit switch is false when closed (grounded)
  }

  public boolean isOpen() {
    return !rightClawOpen.get();  // limit switch is false when closed (grounded)
  }
}
