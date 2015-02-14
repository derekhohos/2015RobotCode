package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author PatrickUbelhor
 */
public class ChopsticksClose extends Command {

    public ChopsticksClose() {
        requires(Robot.chopsticks);
    }

    protected void initialize() {
    	Globals.chopsticksOpen = false;
    }

    protected void execute() {
    	Robot.chopsticks.close();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
