package org.usfirst.frc.team6718.robot.commands;

import org.usfirst.frc.team6718.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SwitchDirection extends Command {
	public SwitchDirection() {
		super("SwitchDirection");
		requires(Robot.driveSystem);
	}
	
	protected void initialize() {
		Robot.driveSystem.switchDirection();
	}
	
	protected void execute() {
		Robot.driveSystem.driveWithJoystick(Robot.oi.getJoystick());
	}
	
	protected boolean isFinished() {
		return false;
	}
}