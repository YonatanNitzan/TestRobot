package org.usfirst.frc.team2212.robot.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shoot extends Command {

	private double speed;
	
    public Shoot(double speed, double timeOut) {
        requires(Robot.shooter);
        this.speed = speed;
        this.setTimeout(timeOut);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.shooter.shoot(speed);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.shooter.shoot(0);
    }

    protected void interrupted() {
    	end();
    }
}
