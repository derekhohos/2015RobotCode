package team.gif.commands;

import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author PatrickUbelhor
 */
public class InitCollectorMotors extends Command {

	private boolean done;
	
    public InitCollectorMotors() {
        requires(Robot.collectorMotors);
        done = false;
    }

    protected void initialize() {
    	Robot.collectorMotors.enable();
    	done = true;
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return done;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
