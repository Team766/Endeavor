package com.ma.bears.Endeavor.commands.Shooter;

import com.ma.bears.Endeavor.RobotValues;
import com.ma.bears.Endeavor.commands.CommandBase;

import edu.wpi.first.wpilibj.Timer;

public class ShootOneCommand extends CommandBase{
	Timer t = new Timer();
	
	protected void end() {
	}
	protected void execute() {
		if(t.get() < RobotValues.shooterPushTime){
			Shooter.setShooterPush(true);
		}
		if(t.get() < RobotValues.shooterWaitBetweenShots && t.get() > RobotValues.shooterPushTime){
			Shooter.setShooterPush(false);
		}			
	}
	protected void initialize() {
		t.reset();
		t.start();
	}
	protected void interrupted() {
		end();
	}
	protected boolean isFinished() {
		return t.get() > RobotValues.shooterWaitBetweenShots;
	}

}
