package team.gif.commands;

import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author PatrickUbelhor
 */
public class ChopsticksOpen extends Command {

    public ChopsticksOpen() {
        requires(Robot.chopsticks);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.chopsticks.open();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
