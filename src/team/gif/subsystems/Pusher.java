package team.gif.subsystems;

import team.gif.RobotMap;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pusher extends Subsystem {
    
	private static final CANTalon totePusher = new CANTalon(RobotMap.totePusher);
    private static final DigitalInput pusherMax = new DigitalInput(RobotMap.pusherMax);
    private static final DigitalInput pusherMin = new DigitalInput(RobotMap.pusherMin);

    public void enableMotors(ControlMode controlMode) {
        totePusher.changeControlMode(controlMode);
        
        totePusher.enableControl();
    }
    
    public void disableMotors() {
    	totePusher.disableControl();
    }

   public void initDefaultCommand() {
		
	}
   public void setSpeed(double speed) {
	   totePusher.set(speed);
   }
   public boolean getMax() {
	   return pusherMax.get();
   }
   public boolean getMin() {
	   return pusherMin.get();
   }
}

