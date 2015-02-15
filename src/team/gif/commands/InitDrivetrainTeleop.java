package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author PatrickUbelhor
 */
public class InitDrivetrainTeleop extends Command {

	private boolean done;
	
    public InitDrivetrainTeleop() {
        requires(Robot.chassis);
        done = false;
    }

    protected void initialize() {
    	Robot.chassis.initBase(Globals.leftEncoderReversed, Globals.rightEncoderReversed,
    						   Globals.leftMotorReversed, Globals.rightMotorReversed);
    	Robot.chassis.enableTeleopControl();
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
