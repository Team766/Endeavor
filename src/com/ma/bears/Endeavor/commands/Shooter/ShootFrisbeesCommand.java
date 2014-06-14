package com.ma.bears.Endeavor.commands.Shooter;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Shoots 4 frisbees and then shuts down.
 * 
 * @author Nicky Ivy nickivyca@gmail.com *
 */

public class ShootFrisbeesCommand extends CommandGroup{
	
	public ShootFrisbeesCommand(){
		//shoot 4
		addSequential(new SpinUpShooterCommand());
		addSequential(new ShootOneCommand());
		addSequential(new ShootOneCommand());
		addSequential(new ShootOneCommand());
		addSequential(new ShootOneCommand());
		addSequential(new ShutDownShooterCommand());
	}
}
