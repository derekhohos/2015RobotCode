package team.gif.commands;

import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Tyler
 */
public class PusherStandby extends Command {

    public PusherStandby() {
        requires(Robot.pusher);
    }

  
    protected void initialize() {
    }

  
    protected void execute() {
    	Robot.pusher.setSpeed(0.0);
    	SmartDashboard.putBoolean("PusherMin", Robot.pusher.getMin());
    	SmartDashboard.putBoolean("PusherMax", Robot.pusher.getMax());
    }

   
    protected boolean isFinished() {
        return false;
    }

   
    protected void end() {
    }

    
    protected void interrupted() {
    }
}
