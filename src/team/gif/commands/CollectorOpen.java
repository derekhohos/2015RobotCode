package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CollectorOpen extends Command {

    public CollectorOpen() {
        requires(Robot.collectorPneumo);
    }

    protected void initialize() {
    	Globals.collectorOpen = true;
    }

    protected void execute() {
    	Robot.collectorPneumo.open();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
