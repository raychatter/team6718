/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team6718.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team6718.robot.RobotMap;

/**
 * The claw subsystem is a simple system with a motor for opening and closing.
 * If using stronger motors, you should probably use a sensor so that the motors
 * don't stall.
 */
public class RightClaw extends Subsystem {
  private Victor motor = new Victor(RobotMap.RIGHT_CLAW_MOTOR);
  private DigitalInput rightClawClosed = new DigitalInput(RobotMap.RIGHT_CLOSED_SWITCH);
  private DigitalInput rightClawOpen = new DigitalInput(RobotMap.RIGHT_OPEN_SWITCH);

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
    motor.set(-0.5);
  }

  /**
   * Set the claw motor to move in the close direction.
   */
  public void close() {
    motor.set(0.5);
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
