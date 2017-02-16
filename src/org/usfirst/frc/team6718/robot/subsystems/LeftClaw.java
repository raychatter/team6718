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
public class LeftClaw extends Subsystem {
  public static final int LEFT_CLAW_MOTOR_PORT = 9;
  public static final int LEFT_CLOSED_LIMIT_SWITCH_PORT = 9;
  public static final int LEFT_OPEN_LIMIT_SWITCH_PORT = 8;
  private Victor motor = new Victor(LEFT_CLAW_MOTOR_PORT);
  private DigitalInput leftClawClosed = new DigitalInput(LEFT_CLOSED_LIMIT_SWITCH_PORT);
  private DigitalInput leftClawOpen = new DigitalInput(LEFT_OPEN_LIMIT_SWITCH_PORT);

  public LeftClaw() {
    super();

    // Let's show everything on the LiveWindow
    LiveWindow.addActuator("LeftClaw", "Motor", motor);
    LiveWindow.addActuator("LeftClaw", "Limit Switch", leftClawOpen);
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
    return !leftClawClosed.get();  // limit switch is false when closed (grounded)
  }

  public boolean isOpen() {
    return !leftClawOpen.get();  // limit switch is false when closed (grounded)
  }
}
