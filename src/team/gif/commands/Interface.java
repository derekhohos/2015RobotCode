package team.gif.commands;

import team.gif.RobotMap;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Interface extends Command {

    public Interface() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.getString("CAN");
    	SmartDashboard.putNumber("frontLeft", 10);
    	RobotMap.frontLeft = (int) SmartDashboard.getNumber("frontLeft");
    	SmartDashboard.putNumber("frontRight", 10);
    	RobotMap.frontRight = (int) SmartDashboard.getNumber("frontRight");
    	SmartDashboard.putNumber("rearLeft", 10);
    	RobotMap.rearLeft = (int) SmartDashboard.getNumber("rearLeft");
    	SmartDashboard.putNumber("rearRight", 10);
    	RobotMap.rearRight = (int) SmartDashboard.getNumber("rearRight");
    	SmartDashboard.putNumber("collectorLeft", 10);
    	RobotMap.collectorLeft = (int) SmartDashboard.getNumber("collectorLeft");
    	SmartDashboard.putNumber("collectorRight", 10);
    	RobotMap.collectorRight = (int) SmartDashboard.getNumber("collectorRight");
    	SmartDashboard.putNumber("elevator", 10);
    	RobotMap.elevator = (int) SmartDashboard.getNumber("elevator");
    	SmartDashboard.putNumber("totePusher", 10);
    	RobotMap.elevator = (int) SmartDashboard.getNumber("totePusher");
    	SmartDashboard.getString("DIO");
    	SmartDashboard.putNumber("leftEncoderA", 10);
    	SmartDashboard.getString("Solenoids");
    	SmartDashboard.putNumber("collector", 10);
    	RobotMap.collector = (int) SmartDashboard.getNumber("collector");
    	SmartDashboard.putNumber("leftArm", 10);
    	RobotMap.leftArm = (int) SmartDashboard.getNumber("leftArm");
    	SmartDashboard.putNumber("rightArm", 10);
    	RobotMap.rightArm = (int) SmartDashboard.getNumber("rightArm");
    	SmartDashboard.putNumber("hooks", 10);
    	RobotMap.hooks = (int) SmartDashboard.getNumber("hooks");
    	SmartDashboard.putNumber("toteGrabber", 10);
    	RobotMap.toteGrabber = (int) SmartDashboard.getNumber("toteGrabber");
    	SmartDashboard.putNumber("chopSticks", 10);
    	RobotMap.chopSticks = (int) SmartDashboard.getNumber("chopSticks");
    	SmartDashboard.getString("Analog");
    	SmartDashboard.putNumber("gyroRate", 10);
    	RobotMap.gyroRate = (int) SmartDashboard.getNumber("gyroRate");
      	}
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
