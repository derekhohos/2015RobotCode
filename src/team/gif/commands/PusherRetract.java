package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Tyler
 */
public class PusherRetract extends Command {

    public PusherRetract() {
        requires(Robot.pusher);
    }

    
    protected void initialize() {
    }

  
    protected void execute() {
    	Robot.pusher.setSpeed(-Globals.pusherSpeed);
    }

   
    protected boolean isFinished() {
        return false; //Robot.pusher.getMin();
    }


    protected void end() {
    }

 
    protected void interrupted() {
    }
}
