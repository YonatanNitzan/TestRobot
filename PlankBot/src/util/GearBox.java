package util;
import edu.wpi.first.wpilibj.SpeedController;

public class GearBox {

	private SpeedController front, rear;
	
	public GearBox(SpeedController front, SpeedController rear) {
		this.front = front;
		this.rear = rear;
	}
	
	public void move(double speed) {
		front.set(speed);
		rear.set(speed);
	}
	
}
