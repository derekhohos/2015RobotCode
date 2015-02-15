package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Armaan
 */
public class ElevatorLower extends Command {

    public ElevatorLower() {
    	requires(Robot.elevator);
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
    	SmartDashboard.putBoolean("ElevatorMin", Robot.elevator.getMin());
    	SmartDashboard.putBoolean("ElevatorMax", Robot.elevator.getMax());
    }

    protected boolean isFinished() {
        return !Robot.elevator.getMin();
    }

    protected void end() {
    	Robot.elevator.setSpeed(0);
    	Robot.elevator.resetEncoder();
    }

    protected void interrupted() {
    	Robot.elevator.setSpeed(0);
    }
}
