package org.usfirst.frc.team2212.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Collector extends Subsystem {

	private SpeedController motor;
	public static final double SPEED = 0.5;

	public void collect(double speed) {
		motor.set(speed);
	}

	public Collector(SpeedController motor) {
		this.motor = motor;
	}
	
	public void initDefaultCommand() {
	}
}
