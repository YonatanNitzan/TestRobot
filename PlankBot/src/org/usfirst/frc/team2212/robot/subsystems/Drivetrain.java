package org.usfirst.frc.team2212.robot.subsystems;

import org.usfirst.frc.team2212.robot.commands.DriveTrainJoystick;

import edu.wpi.first.wpilibj.command.Subsystem;
import util.GearBox;

/**
 *
 */
public class Drivetrain extends Subsystem {

	private GearBox left;
	private GearBox right;
	public static final double SPEED = 1;
    
    public Drivetrain(GearBox left, GearBox right) {
    	this.left = left;
    	this.right = right;
    }
    
    public void move(double speedLeft, double speedRight) {
    	left.move(-speedLeft);
    	right.move(speedRight);
    }
    
    public void initDefaultCommand() {
    	new DriveTrainJoystick();
    }
}

