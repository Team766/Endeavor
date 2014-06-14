package com.ma.bears.Endeavor.commands.Shooter;

import com.ma.bears.Endeavor.RobotValues;
import com.ma.bears.Endeavor.commands.CommandBase;

import edu.wpi.first.wpilibj.Timer;

/**
 * Spins up shooter. Uses a pre-determined time
 * to tell if the shooter is fully spun up.
 * 
 * @author Nicky Ivy nickivyca@gmail.com
 */

public class SpinUpShooterCommand extends CommandBase {
	Timer t = new Timer();

	protected void end() {
		Shooter.setShooterAtSpeed(true);
	}

	protected void execute() {
	}
	
	protected void initialize() {
		Shooter.shooterOn();
		t.reset();
		t.start();
	}

	protected void interrupted() {
		Shooter.setShooterSpeed(0);
		end();
	}

	protected boolean isFinished() {
		return t.get() > RobotValues.shooterSpinUpTime;
	}

}
