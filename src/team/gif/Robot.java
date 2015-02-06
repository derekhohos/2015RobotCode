
package team.gif;

import team.gif.commands.*;
import team.gif.subsystems.*;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final Elevator elevator = new Elevator();
	public static final Drivetrain chassis = new Drivetrain();
	public static final Pusher pusher = new Pusher();
	public static final Chopsticks chopsticks = new Chopsticks();
	public static final CollectorMotors collectorMotors = new CollectorMotors();
	public static final CollectorPneumatics collectorPneumo = new CollectorPneumatics();
	public static OI oi;
	
	private static Compressor compressor = new Compressor(0);

	Command elevInit;
	Command driveInitAuto;
	Command driveInitTeleop;
	Command pusherInit;
	Command collectorInit;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
		driveInitAuto = new InitDrivetrainAuto();
		driveInitTeleop = new InitDrivetrainTeleop();
		pusherInit = new InitPusher();
		collectorInit = new InitCollectorMotors();
		elevInit = new InitElevator();
		
		compressor.start();
		driveInitAuto.start();
		pusherInit.start();
		collectorInit.start();
		elevInit.start();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        //if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        //if (autonomousCommand != null) autonomousCommand.cancel();
    	//if (driveInitAuto != null) { driveInitAuto.cancel(); };
    	driveInitTeleop.start();
    }


    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putData(chassis);
        SmartDashboard.putData(chopsticks);
        SmartDashboard.putData(collectorMotors);
        SmartDashboard.putData(collectorPneumo);
        SmartDashboard.putData(elevator);
        SmartDashboard.putData(pusher);
    }
    
    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }
    
    public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
