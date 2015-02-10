package team.gif.commands;

import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Armaan
 */
public class ElevatorStandby extends Command {

    public ElevatorStandby() {
    	requires(Robot.elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.elevator.setSpeed(0);
    	SmartDashboard.putNumber("ElevatorHeight", Robot.elevator.get());
    	SmartDashboard.putNumber("ElevatorRaw", Robot.elevator.getRaw());
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
