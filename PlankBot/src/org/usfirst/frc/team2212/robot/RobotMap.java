package org.usfirst.frc.team2212.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public interface PWM{
		public static final int COLLECTOR_PORT = 2;
		public static final int SHOOTER_PORT = 1;
		public static final int ARM_PORT = 0;
	}
	
	public interface CAN {
		public static final int LEFT_FRONT_SP_PORT = 1;
		public static final int LEFT_REAR_SP_PORT = 4;
		public static final int RIGHT_FRONT_SP_PORT = 5;
		public static final int RIGHT_REAR_SP_PORT = 6;	
	}
	
	public interface DIO {
		public static final int LIMIT_UP_PORT = 6;
		public static final int LIMIT_DOWN_PORT = 2;
	}
}