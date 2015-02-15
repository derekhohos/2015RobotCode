package team.gif.autocommands;

import team.gif.Globals;
import team.gif.commands.ChopsticksClose;
import team.gif.commands.ChopsticksOpen;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoFeederStack extends CommandGroup {
    
    public  AutoFeederStack() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	if (!Globals.chopsticksOpen) {
    		addParallel(new ChopsticksOpen());
    	}
    	addSequential(new AutoElevLevel(Globals.kElevatorLevel3));
    	Timer.delay(2.5);
    	
    	addSequential(new AutoElevLevel(Globals.kElevatorLevel2));
    	addParallel(new ChopsticksClose());
    	Timer.delay(0.1);
    	addSequential(new AutoElevLevel(Globals.kElevatorLevel3 + 100));
    	Timer.delay(2.5);
    	
    	addSequential(new AutoElevLevel(Globals.kElevatorLevel3));
    	addParallel(new ChopsticksOpen());
    	Timer.delay(0.1);
    	addSequential(new AutoElevLevel(Globals.kElevatorLevel2));
    	addParallel(new ChopsticksClose());
    	Timer.delay(0.1);
    	addSequential(new AutoElevLevel(Globals.kElevatorLevel3 + 100));
    	Timer.delay(2.5);
    	
    	addSequential(new AutoElevLevel(Globals.kElevatorLevel3));
    	addParallel(new ChopsticksOpen());
    	Timer.delay(0.1);
    	addSequential(new AutoElevLevel(Globals.kElevatorLevel4));
    	addParallel(new ChopsticksClose());
    }
}
