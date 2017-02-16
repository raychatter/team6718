package org.usfirst.frc.team6718.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6718.robot.RobotMap;
import org.usfirst.frc.team6718.robot.commands.DriveInASquare;
import org.usfirst.frc.team6718.robot.commands.CloseClawsAndMoveConveyor;
import org.usfirst.frc.team6718.robot.commands.ConveyorDown;
import org.usfirst.frc.team6718.robot.commands.ConveyorUp;
import org.usfirst.frc.team6718.robot.commands.OpenClaws;
import org.usfirst.frc.team6718.robot.commands.CloseClaws;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	public static final int JOYSTICK_PORT = 0;
	private Joystick stick  = new Joystick(JOYSTICK_PORT);

	// Button button = new JoystickButton(stick, 11);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	public OI() {
		JoystickButton driveSquareButton = new JoystickButton(stick, RobotMap.DRIVE_SQUARE_BUTTON);
		driveSquareButton.whenPressed(new DriveInASquare());

		JoystickButton clawCloseAndConveyorButton = new JoystickButton(stick, RobotMap.CLAW_CLOSE_AND_CONVEYOR_BUTTON);
		clawCloseAndConveyorButton.whenPressed(new CloseClawsAndMoveConveyor());

		JoystickButton conveyorDownButton = new JoystickButton(stick, RobotMap.CONVEYOR_DOWN_BUTTON);
		conveyorDownButton.whenPressed(new ConveyorDown());

		JoystickButton conveyorUpButton = new JoystickButton(stick, RobotMap.CONVEYOR_UP_BUTTON);
		conveyorUpButton.whenPressed(new ConveyorUp());

		JoystickButton leftClawOpenButton = new JoystickButton(stick, RobotMap.CLAW_OPEN_BUTTON);
		leftClawOpenButton.whenPressed(new OpenClaws());

		JoystickButton leftClawCloseButton = new JoystickButton(stick, RobotMap.CLAW_CLOSE_BUTTON);
		leftClawCloseButton.whenPressed(new CloseClaws());
	}

	public Joystick getJoystick() {
		return stick;
	}

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new DriveWithJoystick());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new DriveWithJoystick());
}
