package org.usfirst.frc.team2212.robot;

import org.usfirst.frc.team2212.robot.commands.Collect;
import org.usfirst.frc.team2212.robot.commands.MoveArm;
import org.usfirst.frc.team2212.robot.commands.Shoot;
import org.usfirst.frc.team2212.robot.subsystems.Arm;
import org.usfirst.frc.team2212.robot.subsystems.Collector;
import org.usfirst.frc.team2212.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI /* GEVALD */ {
	private Joystick leftJoystick;
	private Joystick rightJoystick;
	private JoystickButton collectButton;
	private JoystickButton shootButton;
	private JoystickButton armUpButton;
	private JoystickButton armDownButton;

	public OI() {
		leftJoystick = new Joystick(0);
		rightJoystick = new Joystick(1);
		createButtons();
		initButtons();
	}

	private void createButtons() {
		collectButton = new JoystickButton(leftJoystick, 3);
		shootButton = new JoystickButton(leftJoystick, 1);
		armUpButton = new JoystickButton(rightJoystick, 3);
		armDownButton = new JoystickButton(rightJoystick, 2);		
	}

	private void initButtons() {
		collectButton.toggleWhenPressed(new Collect(Collector.SPEED));
		shootButton.whenPressed(new Shoot(Shooter.SPEED, 5));
		armUpButton.toggleWhenPressed(new MoveArm(Arm.SPEED_UP));
		armDownButton.toggleWhenPressed(new MoveArm(Arm.SPEED_DOWN));
	}
	
	public double getLeftY() {
		return adjust(leftJoystick.getY());
	}
	
	public double getRightY() {
		return adjust(rightJoystick.getY());
	}
	
	private double adjust(double in) {
		return Math.pow(in, 3);
	}
}