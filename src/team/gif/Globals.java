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
	
	public static final double elevatorP = 1;
	public static final double elevatorI = 0;
	public static final double elevatorD = 0;
	
	public static int kElevatorLevel1 = 50;
	public static int kElevatorLevel2 = 50;
	public static int kElevatorLevel3 = 50;
	public static int kElevatorLevel4 = 50;
	public static int kElevatorLevel5 = 50;
}
