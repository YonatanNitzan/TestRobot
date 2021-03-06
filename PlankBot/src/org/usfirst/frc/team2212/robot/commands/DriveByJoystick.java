package org.usfirst.frc.team2212.robot.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveByJoystick extends Command {

    public DriveByJoystick() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.drive(Robot.oi.getLeftY(), Robot.oi.getRightY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	
    }

    protected void interrupted() {
    	
    }
}
