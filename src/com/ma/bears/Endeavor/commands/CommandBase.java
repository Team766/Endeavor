package com.ma.bears.Endeavor.commands;

import com.ma.bears.Endeavor.subsystems.Drive;

import com.ma.bears.Endeavor.subsystems.Shooter;
import com.ma.bears.Endeavor.OI;
import com.ma.bears.Endeavor.Ports;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Command;

/**
 * CommandBase. Declare all subsystems 
 * and OI here static.
 * 
 * @author Nicky Ivy nickivyca@gmail.com
 *
 */

public abstract class CommandBase extends Command{

    public static Drive Drive = new Drive();
    public static Shooter Shooter = new Shooter();
    public static OI OI = new OI();

    public static Compressor Compr = new Compressor(Ports.DIO_Pressure, Ports.Relay_Compr);
    
    public static void init(){
    	Compr.start();
    }

}
