package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoElevLevel extends Command {

	private boolean goingUp;
	private int setP;
	
    public AutoElevLevel(double setpoint) {
        requires(Robot.elevator);
        if (Robot.elevator.get() > setP) {
        	goingUp = false;
        } else {
        	goingUp = true;
        }
    }

    protected void initialize() {
    }

    protected void execute() {
    	if (goingUp && Robot.elevator.get() < setP) {
    		Robot.elevator.setSpeed(Globals.elevatorSpeed);
    	}
    	if (goingUp && Robot.elevator.get() > setP) {
    		Robot.elevator.setSpeed(0);
    		goingUp = !goingUp;
    	}
    	if (!goingUp && Robot.elevator.get() > setP) {
    		Robot.elevator.setSpeed(-Globals.elevatorSpeed);
    	}
    	if (!goingUp && Robot.elevator.get() < setP) {
    		Robot.elevator.setSpeed(0);
    		goingUp = !goingUp;
    	}
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
