package org.usfirst.frc.team6718.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6718.robot.commands.DriveInASquare;

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
	public static final int TRIGGER_DRIVE_SQUARE_BUTTON_NUMBER = 2;
	private static OI instance = null;
	private Joystick stick;
	private JoystickButton triggerDriveSquareButton;
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
		stick = new Joystick(JOYSTICK_PORT);
		triggerDriveSquareButton = new JoystickButton(stick, TRIGGER_DRIVE_SQUARE_BUTTON_NUMBER);
		triggerDriveSquareButton.whenPressed(new DriveInASquare());

	}

	public static OI getInstance() {
		if (instance == null) {
			instance = new OI();
		}
		return instance;
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
