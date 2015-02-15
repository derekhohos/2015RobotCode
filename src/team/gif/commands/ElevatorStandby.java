package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Armaan
 */
public class ElevatorStandby extends Command {

	private double setP = 0;
	
    public ElevatorStandby() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    	setP = Robot.elevator.get();
    }

    protected void execute() {
    	
    	double error = (setP - Robot.elevator.get());
    	
    	Robot.elevator.setSpeed(0.5 * (error / Globals.elevatorP));
    	
    	SmartDashboard.putNumber("ElevatorHeight", Robot.elevator.get());
    	SmartDashboard.putBoolean("ElevatorDirection", Robot.elevator.getDirection());
    	SmartDashboard.putBoolean("ElevIsStopped", Robot.elevator.isStopped());
    	SmartDashboard.putBoolean("ElevatorMin", Robot.elevator.getMin());
    	SmartDashboard.putBoolean("ElevatorMax", Robot.elevator.getMax());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
