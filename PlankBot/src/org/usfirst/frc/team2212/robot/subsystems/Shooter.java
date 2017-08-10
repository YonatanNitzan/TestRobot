package org.usfirst.frc.team2212.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

	private SpeedController motor;
	public static final double SPEED = 0.5;

	public void initDefaultCommand() {

	}

	public void shoot(double speed) {
		motor.set(speed);
	}

	public Shooter(SpeedController motor) {
		this.motor = motor;
	}
}

