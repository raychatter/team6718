package org.usfirst.frc.team6718.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6718.robot.RobotMap;

/**
 *
 */
public class Conveyor extends Subsystem {
  private Victor conveyorMotor = new Victor(RobotMap.CONVEYOR_MOTOR);
  private DigitalInput conveyorAtTop = new DigitalInput(RobotMap.TOP_SWITCH);
  private DigitalInput conveyorAtBottom = new DigitalInput(RobotMap.BOTTOM_SWITCH);

  public void moveToBottom() {
    conveyorMotor.set(-0.25);
  }

  public void moveToTop() {
    conveyorMotor.set(0.4);
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
