package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Armaan
 */
public class ElevatorLower extends Command {
	
	int minHeight;

    public ElevatorLower(int setpoint) {
      requires(Robot.elevator);
      minHeight = Robot.elevator.get() - setpoint;
    }

    protected void initialize() {
    }

    protected void execute() {
    	if (Robot.elevator.getMin()) {
    		Robot.elevator.setSpeed(-Globals.elevatorSpeed);
    	} else {
    		Robot.elevator.setSpeed(0);
    	}
    	SmartDashboard.putNumber("ElevatorHeight", Robot.elevator.get());
    	SmartDashboard.putNumber("ElevSetpoint", minHeight);
    	SmartDashboard.putBoolean("ElevatorMin", Robot.elevator.getMin());
    	SmartDashboard.putBoolean("ElevatorMax", Robot.elevator.getMax());
    }

    protected boolean isFinished() {
        return Robot.elevator.get() < minHeight;
    }

    protected void end() {
    	Robot.elevator.setSpeed(0);
    }

    protected void interrupted() {
    	Robot.elevator.setSpeed(0);
    }
}
