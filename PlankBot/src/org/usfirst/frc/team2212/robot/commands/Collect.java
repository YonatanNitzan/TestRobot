package org.usfirst.frc.team2212.robot.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Collect extends Command {

	private double speed;
	
    public Collect(double speed) {
        requires(Robot.collector);
        this.speed = speed;
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.collector.collect(speed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.collector.collect(0);
    }

    protected void interrupted() {
    	end();
    }
}
