package team.gif.commands.auto;

import team.gif.Globals;
import team.gif.Robot;
import team.gif.commands.CollectorOpen;
import team.gif.commands.Logger;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author PatrickUbelhor
 */
public class AutoElevLevel extends Command {
	
	private double setP;
	private double Kp = 50;
	private final double tolerance = 25;
	private double error;
	private boolean isLevelOne = false;
	
    public AutoElevLevel(double setpoint) {
        requires(Robot.elevator);
        setP = setpoint;
        if (setpoint == Globals.kElevatorLevel1) {
        	isLevelOne = true;
        }
    }

    protected void initialize() {
    	if (Globals.firstLevel) {
    		(new CollectorOpen()).start();
    		Timer.delay(0.35);
    	}
    	//(new Logger()).start();
    }

    protected void execute() {
    	error = (setP - Robot.elevator.get());
    	
    	double speed = 1 * (error / Kp);
    	
    	Robot.elevator.setSpeed(0.5 * (error / Kp));
    	
    	SmartDashboard.putNumber("Error:", error);
    	SmartDashboard.putNumber("ElevSpeed", speed);
    	SmartDashboard.putNumber("ElevatorHeight", Robot.elevator.get());
    	
    	Globals.targetElevLevel = Math.abs(error) < tolerance;
    }

    protected boolean isFinished() {
    	return Math.abs(error) < tolerance;
    }

    protected void end() {
    	if (isLevelOne) {
    		(new AutoElevReset()).start();
    		Globals.firstLevel = true;
    	} else {
    		Globals.firstLevel = false;
    	}
    }

    protected void interrupted() {
    }
}
