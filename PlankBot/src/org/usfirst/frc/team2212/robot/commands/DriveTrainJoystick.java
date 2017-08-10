package org.usfirst.frc.team2212.robot.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTrainJoystick extends Command {

    public DriveTrainJoystick() {
    }

    protected void initialize() {
    	requires(Robot.drivetrain);
    }

    protected void execute() {
    	Robot.drivetrain.move(Robot.oi.getLeftY(), Robot.oi.getRightY());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	
    }

    protected void interrupted() {
    	end();
    }
}
