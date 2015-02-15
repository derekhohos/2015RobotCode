package team.gif;

public class Globals {
	
	/**
	 * This file defines the motor speeds used when each subsystem is actuated.
	 * If a value is changed, code must be redeployed.
	 * DO NOT EDIT UNLESS YOU KNOW WHAT YOU ARE DOING. PLEASE CONSULT SOMEONE WHO DOES.
	 */
	
	public static double collectorSpeed = 1;
	public static final double pusherSpeed = 0.5;
	public static final double elevatorSpeed = 0.8;
	
	public static final double elevEncoderDistperTick = 0;
	public static final double driveEncoderDistPerTick = 0.1256;
	public static final boolean leftEncoderReversed = true;
	public static final boolean rightEncoderReversed = false;
	
	public static final boolean leftMotorReversed = true;
	public static final boolean rightMotorReversed = false;
	
	public static final double drivetrainP = 1;
	public static final double drivetrainI = 0;
	public static final double drivetrainD = 0;
	
	public static final double elevatorP = 50;
	public static final double elevatorI = 0;
	public static final double elevatorD = 0;
	
	public static final double kElevatorLevel1 = 0;
	public static final double kElevatorLevel2 = 260;
	public static final double kElevatorLevel3 = 520;
	public static final double kElevatorLevel4 = 780;
	public static final double kElevatorLevel5 = 1040;
	
	public static boolean chopsticksOpen = true;
	public static boolean collectorOpen = true;
	public static boolean targetElevLevel = false;
	public static boolean firstLevel = true;
	
}
