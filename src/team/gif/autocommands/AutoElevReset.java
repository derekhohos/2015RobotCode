package team.gif.autocommands;

import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author PatrickUbelhor
 */
public class AutoElevReset extends Command {

    public AutoElevReset() {
        requires(Robot.elevator);
    }

    protected void initialize() {
    }

    protected void execute() {
    	if (Robot.elevator.getMin()) {
    		Robot.elevator.setSpeed(-0.2);
    	} else {
    		Robot.elevator.setSpeed(0);
    	}
    }
    protected boolean isFinished() {
        return !Robot.elevator.getMin();
    }

    protected void end() {
    	Robot.elevator.resetEncoder();
    }

    protected void interrupted() {
    }
}
