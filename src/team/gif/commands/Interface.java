package team.gif.commands;

import team.gif.Globals;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Interface extends Command {

    public Interface() {
    }

    protected void initialize() {
    	SmartDashboard.putNumber("kElevatorLevel1", Globals.kElevatorLevel1);
    	SmartDashboard.putNumber("kElevatorLevel2", Globals.kElevatorLevel2);
    	SmartDashboard.putNumber("kElevatorLevel3", Globals.kElevatorLevel3);
    	SmartDashboard.putNumber("kElevatorLevel4", Globals.kElevatorLevel4);
    	SmartDashboard.putNumber("kElevatorLevel5", Globals.kElevatorLevel5);
    	SmartDashboard.putNumber("CollectorSpeed", Globals.collectorSpeed);
    }

    protected void execute() {
    	Globals.collectorSpeed = SmartDashboard.getNumber("CollectorSpeed");
    	Globals.kElevatorLevel1 = SmartDashboard.getInt("kElevatorLevel1");
    	Globals.kElevatorLevel2 = SmartDashboard.getInt("kElevatorLevel2");
    	Globals.kElevatorLevel3 = SmartDashboard.getInt("kElevatorLevel3");
    	Globals.kElevatorLevel4 = SmartDashboard.getInt("kElevatorLevel4");
    	Globals.kElevatorLevel5 = SmartDashboard.getInt("kElevatorLevel5");
    }
    
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
