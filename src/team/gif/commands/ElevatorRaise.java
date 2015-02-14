package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Armaan
 */
public class ElevatorRaise extends Command {

    public ElevatorRaise() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
    	if (Robot.elevator.getMax()) {
    		Robot.elevator.setSpeed(Globals.elevatorSpeed);
    	} else {
    		Robot.elevator.setSpeed(0);
    	}
    	SmartDashboard.putNumber("ElevatorHeight", Robot.elevator.get());
    	SmartDashboard.putBoolean("ElevatorMin", Robot.elevator.getMin());
    	SmartDashboard.putBoolean("ElevatorMax", Robot.elevator.getMax());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.elevator.setSpeed(0);
    }

    protected void interrupted() {
    	Robot.elevator.setSpeed(0);
    }
}
