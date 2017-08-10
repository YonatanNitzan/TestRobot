package org.usfirst.frc.team2212.robot.commands;

import org.usfirst.frc.team2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveArm extends Command {

	private double speed;
	
    public MoveArm(double speed) {
        requires(Robot.arm);
        this.speed = speed;
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.arm.tryMove(speed);
    }

    protected boolean isFinished() {
        return !(Robot.arm.canMove(speed));
    }

    protected void end() {
    	Robot.arm.tryMove(0);
    }

    protected void interrupted() {
    	end();
    }
}
