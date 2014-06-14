package com.ma.bears.Endeavor.subsystems;

import com.ma.bears.Victor884;
import com.ma.bears.Endeavor.Ports;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem{
	
	private Victor884 ShooterWheels = new Victor884(Ports.PWM_ShooterWheels);
	private Solenoid ShooterPush = new Solenoid(Ports.Sol_ShooterPusher);
	
	private boolean shooterAtSpeed = false;

	protected void initDefaultCommand() {
	}
	
	public void shooterOn(){
		ShooterWheels.set(1);
	}
	public void shooterOff(){
		ShooterWheels.set(0);
	}
	public void setShooterSpeed(double speed){
		ShooterWheels.set(speed);
	}
	public void pusherOut(){
		ShooterPush.set(true);
	}
	public void pusherIn(){
		ShooterPush.set(false);
	}
	public void setShooterPush(boolean out){
		ShooterPush.set(out);
	}
	
	public void setShooterAtSpeed(boolean atspeed){
		shooterAtSpeed = atspeed;
	}
	
	public boolean getShooterAtSpeed(){
		return shooterAtSpeed;
	}

}
