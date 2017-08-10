package org.usfirst.frc.team2212.robot.subsystems;

import org.usfirst.frc.team2212.robot.commands.DriveByJoystick;

import edu.wpi.first.wpilibj.command.Subsystem;
import util.GearBox;

/**
 *
 */
public class Drivetrain extends Subsystem {

	private GearBox left;
	private GearBox right;
    
    public Drivetrain(GearBox left, GearBox right) {
    	this.left = left;
    	this.right = right;
    }
    
    public void drive(double speedLeft, double speedRight) {
    	left.set(-speedLeft);
    	right.set(speedRight);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveByJoystick());
    }
}

