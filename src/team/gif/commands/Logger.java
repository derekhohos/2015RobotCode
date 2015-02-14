package team.gif.commands;

import java.io.FileWriter;
import java.io.IOException;

import team.gif.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Logger extends Command {

	private FileWriter fw = null;
	
    public Logger() {
    	try {
			fw = new FileWriter("/", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    protected void initialize() {
    }

    protected void execute() {
    	try {
			fw.write(Double.toString(Robot.elevator.getVoltage()));
			fw.write('\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    	try {
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
