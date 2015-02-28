package com.ma.bears.Endeavor.commands.Shooter;

import com.ma.bears.Endeavor.RobotValues;
import com.ma.bears.Endeavor.commands.CommandBase;

import edu.wpi.first.wpilibj.Timer;

public class ShootFrisbeeCommand extends CommandBase{
	private Timer t;
	
	public ShootFrisbeeCommand()
	{
		t = new Timer();
	}
	protected void end() {
		Shooter.pusherIn();
		t.stop();
	}

	protected void execute() {}

	protected void initialize() {
		Shooter.pusherOut();
		t.reset();
		t.start();
	}

	protected void interrupted() {
		end();
	}

	protected boolean isFinished() {
		return t.get() > RobotValues.shooterPushTime;
	}

}
