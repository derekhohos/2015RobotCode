package team.gif.commands;

import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PusherStandby extends Command {

    public PusherStandby() {
        
    }

  
    protected void initialize() {
    }

  
    protected void execute() {
    	Robot.pusher.setSpeed(0.0);
    }

   
    protected boolean isFinished() {
        return false;
    }

   
    protected void end() {
    }

    
    protected void interrupted() {
    }
}
