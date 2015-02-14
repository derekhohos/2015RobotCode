package team.gif.subsystems;

import team.gif.RobotMap;
import team.gif.commands.ElevatorStandby;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/** Doin' Elevator Stuff....
 * @author Armaan
 */

public class Elevator extends Subsystem {
	
	private static final CANTalon elevator = new CANTalon(RobotMap.elevator);
	private static final Encoder height = new Encoder(RobotMap.elevatorA, RobotMap.elevatorB, true, EncodingType.k4X);
	private static final DigitalInput elevatorMax = new DigitalInput(RobotMap.elevatorMax);
	private static final DigitalInput elevatorMin = new DigitalInput(RobotMap.elevatorMin);
	
	public Elevator(){
		super();
		height.reset();
	}
	
	public double getVoltage() {
		return elevator.getBusVoltage();
	}
	
	public boolean getMin() {
		return elevatorMin.get();
	}
	
	public boolean getMax() {
		return elevatorMax.get();
	}
	
	public void resetEncoder() {
		height.reset();
	}
	
	public double get() {
		height.setDistancePerPulse(1.0d);
		return height.getDistance();
	}
	
	public int getRaw() {
		return height.getRaw();
	}
	
	public boolean getDirection() {
		return height.getDirection();
	}
	
	public boolean isStopped() {
		return height.getStopped();
	}
	
	public void enableMotors(ControlMode controlMode) {
		elevator.changeControlMode(controlMode);
		
		elevator.enableControl();
	}
	
	public void setSpeed(double speed) {
    	elevator.set(speed);
    }
	
	public void disableMotors() {
		elevator.disableControl();
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new ElevatorStandby());
    }
    
}
