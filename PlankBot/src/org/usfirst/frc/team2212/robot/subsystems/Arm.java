package org.usfirst.frc.team2212.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {

	private SpeedController motor;
	private DigitalInput upLimit;
	private DigitalInput downLimit;
	public static final double SPEED_UP = 0.5;
	public static final double SPEED_DOWN = -0.2;

    public Arm(SpeedController motor, DigitalInput up, DigitalInput down) {
    	this.motor = motor;
    	upLimit = up;
    	downLimit = down;
	}
    
    public void tryMove(double speed) {
    	if (canMove(speed))
    		motor.set(speed);
    }

    public boolean canMove(double speed) {
		return !((speed > 0 && upLimit.get() == true) || (speed < 0 && downLimit.get() == true));
    }
    
	public void initDefaultCommand() {
		motor.set(0);
	}
}

