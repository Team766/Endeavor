package com.ma.bears.Endeavor;

import com.ma.bears.Endeavor.commands.Shooter.ShootFrisbeesCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * OI class. Declare buttons, joysticks here.
 * 
 * <p>
 * Additionally, is used for gamepad logic.
 * 
 * @author Nicky Ivy nickivyca@gmail.com
 */

public class OI {
	public Joystick
    jLeft = new Joystick(1),
    jRight = new Joystick(2),
    jBox = new Joystick(3),
    jGpad = new Joystick(4);
    
    public Button 
    buttonShifter = new JoystickButton(jLeft, Buttons.Shifter),
    buttonReverse = new JoystickButton(jRight, Buttons.Reverse),
    buttonQuickTurn = new JoystickButton(jRight, Buttons.QuickTurn),
    buttonShoot = new JoystickButton(jBox, Buttons.Shoot),
    buttonDriverShoot = new JoystickButton(jRight, Buttons.DriverShoot),
    
    GPbuttonShifter = new JoystickButton(jGpad, Buttons.GPShifter),
    GPbuttonReverse = new JoystickButton(jGpad, Buttons.GPReverse),
    GPbuttonQuickTurn = new JoystickButton(jGpad, Buttons.GPQuickTurn),
    GPbuttonShoot = new JoystickButton(jGpad, Buttons.GPShoot);
    
    public static boolean TankDrive = false;
    public static boolean UseGamepad = false;
    
    public OI(){
    	buttonShoot.whileHeld(new ShootFrisbeesCommand());
    	GPbuttonShoot.whileHeld(new ShootFrisbeesCommand());
    }public boolean getShifter(){
		return !UseGamepad? buttonShifter.get() : GPbuttonShifter.get();
	}
	public boolean getQuickTurn(){
		return !UseGamepad? buttonQuickTurn.get() : GPbuttonQuickTurn.get();
	}
	public boolean getReverse(){
		return !UseGamepad? buttonReverse.get() : GPbuttonReverse.get();
	}
	
	//cheesydrive here
	public double getThrottle(){
		return !UseGamepad? jLeft.getY() : jGpad.getRawAxis(2);
	}
	public double getSteer(){
		return !UseGamepad? jRight.getX() : jGpad.getRawAxis(3);
	}
	//tank drive here
	public double getLeft(){
		return !UseGamepad? jLeft.getRawAxis(2) : jGpad.getRawAxis(2);
	}
	public double getRight(){
		return !UseGamepad? jRight.getRawAxis(2) : jGpad.getRawAxis(4);
	}
	public static void setTankDrive(boolean in){
		TankDrive = in;
	}
	public static boolean getTankDrive(){
		return TankDrive;
	}
	public static void setUseGamepad(boolean in){
		UseGamepad = in;
	}
	public static boolean getUseGamepad(){
		return UseGamepad;
	}

}
