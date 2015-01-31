package team.gif;
/**
 * This class defines the port number of every sensor and actuator.
 * IT ALLOWS MECHANICAL/ELECTRICAL TO EASILY CHANGE PORT NUMBERS WITHOUT DIGGING THROUGH CODE!
 * DO NOT touch this file if you have not been informed how to properly change the code.
 */
public class RobotMap {
	
	// CAN addresses
    public static int frontLeft = 0;
    public static int frontRight = 1;
    public static int rearLeft = 2;
    public static int rearRight = 3;
    public static int collectorLeft = 4;
    public static int collectorRight = 5;
    public static int elevator = 6;
    public static int totePusher = 7;
    
    // DIO ports
    public static int pusherMax = 0;
    public static int pusherMin = 1;
    
    // Relay ports (solenoids)
    // Based off the list found here (1/21/15): http://oswegofirst.org/forum/viewtopic.php?f=12&t=2968
    public static int collector = 0;
    public static int leftArm = 1;
    public static int rightArm = 2;
    public static int hooks = 3;
    public static int toteGrabber = 4;
    public static int chopSticks = 5;
    
    // Analog ports
    public static int gyroRate = 0; // Gyro MUST be on either 0 or 1
=======
    public static final int frontLeft = 1;
    public static final int frontRight = 2;
    public static final int rearLeft = 3;
    public static final int rearRight = 4;
    public static final int collectorLeft = 5;
    public static final int collectorRight = 6;
    public static final int elevator = 7;
    public static final int totePusher = 8;
    
    // DIO ports
    public static final int elevatorA = 4;
    public static final int elevatorB = 5;
    
    // Relay ports (solenoids)
    public static final int collectorA = 0;
    public static final int collectorB = 1;
    public static final int leftRCarmA = 2;
    public static final int leftRCarmB = 3;
    public static final int rightRCarmA = 4;
    public static final int rightRCarmB = 5;
    public static final int hooksA = 6;
    public static final int hooksB = 7;
    public static final int chopSticksA = 8;
    public static final int chopSticksB = 9;
>>>>>>> 8daa2f1d31652ef998fc4338f5703c54649400e3
    
}
