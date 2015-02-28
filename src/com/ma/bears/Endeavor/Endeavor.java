/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.ma.bears.Endeavor;

import com.ma.bears.Endeavor.commands.CommandBase;
import com.ma.bears.Endeavor.commands.Drive.CheesyDriveCommand;
import com.ma.bears.Endeavor.commands.Drive.TankDriveCommand;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * 2013 robot Endeavor.
 * 
 * <p>
 * Has a frisbee shooter and drives. That's pretty much it.
 * <p>
 * Frisbee shooter runs off of commands and when 
 * the button is held it will shoot 4 frisbees.
 * 
 * <p>
 * Can be controlled by normal OI or DirectInput gamepad
 * and also has a toggle between CheesyDrive
 * and tank drive. Those options are in
 * SmartDashboard.
 * 
 * <p>Old things like elevator are not implemented.
 * 
 * @author Nicky Ivy nickivyca@gmail.com
 */
public class Endeavor extends IterativeRobot {
    
    public void robotInit(){
    	SmartDashboard.putBoolean("Tank Drive", false);
    	SmartDashboard.putBoolean("UseGamePad", false);
    	CommandBase.init();
    }
    
    public void teleopInit(){
    	OI.setTankDrive(SmartDashboard.getBoolean("Tank Drive"));
    	OI.setUseGamepad(SmartDashboard.getBoolean("UseGamePad"));
		if(!OI.getTankDrive()){
			new CheesyDriveCommand().start();			
		}else{
			new TankDriveCommand().start();
		}
    }
    
    public void teleopPeriodic(){
    	
    	Scheduler.getInstance().run();
    }
}
