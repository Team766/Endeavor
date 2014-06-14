package com.ma.bears.Endeavor.commands.Shooter;

import com.ma.bears.Endeavor.commands.CommandBase;

/**
 * Shuts down shooter.
 * 
 * @author Nicky Ivy nickivyca@gmail.com *
 */

public class ShutDownShooterCommand extends CommandBase{

	protected void end() {
	}
	protected void execute() {
	}
	protected void initialize() {
		Shooter.setShooterSpeed(0);
	}
	protected void interrupted() {
	}
	protected boolean isFinished() {
		return false; //so that sequential command doesn't start up again
	}

}
