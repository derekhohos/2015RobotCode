package team.gif.commands;

import team.gif.Robot;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author PatrickUbelhor
 */
public class InitPusher extends Command {

	private boolean done;
	
    public InitPusher() {
        requires(Robot.pusher);
        done = false;
    }

    protected void initialize() {
    	Robot.pusher.enableMotors(ControlMode.PercentVbus);
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
