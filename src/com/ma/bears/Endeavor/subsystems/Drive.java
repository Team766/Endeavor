package com.ma.bears.Endeavor.subsystems;

import com.ma.bears.Victor884;
import com.ma.bears.Endeavor.Ports;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Drive subsystem.
 * 
 * @author Nicky Ivy nickivyca@gmail.com
 *
 */

public class Drive extends Subsystem{
    private Victor884 leftDrive = new Victor884(Ports.PWM_Left_Drive);
    private Victor884 rightDrive = new Victor884(Ports.PWM_Right_Drive);
    
    private final Solenoid Shifter = new Solenoid(Ports.Sol_Shifter);

	protected void initDefaultCommand() {
	}
	
	public void setDrive(double speedL, double speedR){
		leftDrive.set(-speedL);
		rightDrive.set(speedR);
	}
	
	public void setLeftSpeed(double speed){
		leftDrive.set(-speed);
	}
	public void setRightSpeed(double speed){
		rightDrive.set(speed);
	}
	public void setShifter(boolean highGear){
		Shifter.set(!highGear);
	}

}
