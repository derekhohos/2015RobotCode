package team.gif.commands;

import team.gif.Globals;
import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Tyler
 */
public class PusherExtend extends Command {

    public PusherExtend() {
    	requires(Robot.pusher);
        
    }

    
    protected void initialize() {
    }

  
    protected void execute() {
    	if (Robot.pusher.getMax()) {
    		Robot.pusher.setSpeed(Globals.pusherSpeed);
    	} else {
    		Robot.pusher.setSpeed(0);
    	}
    	SmartDashboard.putBoolean("PusherMin", Robot.pusher.getMin());
    	SmartDashboard.putBoolean("PusherMax", Robot.pusher.getMax());
    }


    protected boolean isFinished() {
        return !Robot.pusher.getMax();
    }

    
    protected void end() {
    	Robot.pusher.setSpeed(0);
    }

   
    protected void interrupted() {
    }
}
