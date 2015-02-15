package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author PatrickUbelhor
 */
public class CollectorClose extends Command {

    public CollectorClose() {
        requires(Robot.collectorPneumo);
    }

    protected void initialize() {
    	Globals.collectorOpen = false;
    }

    protected void execute() {
    	Robot.collectorPneumo.close();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
