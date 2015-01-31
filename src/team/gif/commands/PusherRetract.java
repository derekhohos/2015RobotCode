package team.gif.commands;

import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PusherRetract extends Command {

    public PusherRetract() {
        requires(Robot.pusher);
    }

    
    protected void initialize() {
    }

  
    protected void execute() {
    	Robot.pusher.setSpeed(-0.2);
    }

   
    protected boolean isFinished() {
        return Robot.pusher.getMin();
    }


    protected void end() {
    }

 
    protected void interrupted() {
    }
}
