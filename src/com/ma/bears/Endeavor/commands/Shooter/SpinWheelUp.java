package com.ma.bears.Endeavor.commands.Shooter;

import com.ma.bears.Endeavor.RobotValues;
import com.ma.bears.Endeavor.commands.CommandBase;

/**
 * Spins up shooter.
 * 
 * @author Brett Levenson
 */

public class SpinWheelUp extends CommandBase {

	protected void end() {
		Shooter.shooterOff();
	}

	protected void execute() {
	}
	
	protected void initialize() {
		Shooter.shooterOn();
	}

	protected void interrupted() {
		end();
	}

	protected boolean isFinished() {
		return false;
	}

}
