package com.ma.bears.Endeavor;

/**
 * If the buttons are not labeled on the joysticks themselves, a handy way to
 * view them (on Windows) is 'joy.cpl' (enter in the start menu) and then select
 * the joystick. It will show which buttons are which.
 * 
 * Driver joysticks
 * <pre>
 *  1: trigger
 * 2-6: they are labeled
 * 7: the little pinky button//Box joystick
 * </pre>
 * Box op is able to run on the silver KOP joystick. The thumb button is button 2.
 * 
 * <p>For DirectInput gamepad (do not use XInput) mapping is as follows:
 *  <pre>
 *  1: Square/X (not cross)
 *  2: Cross/A
 *  3: Circle/B
 *  4: Triangle/Y
 *  5: Left trigger1
 *  6: Right trigger1
 *  7: Left trigger2
 *  8: Right trigger2
 *  9/10: empty or custom mapped to enable/disable
 *  11: Left stick press
 *  12: Right stick press
 *  </pre>
 */ 
public class Buttons {
    public static int Spinner = 2;
	public static int Shifter = 7;
    public static int Reverse = 7;
    public static int QuickTurn = 7;
    
    public static int DriverShoot = 1;
    public static int Shoot = 1;
    
    public static int GPShifter = 11;
    public static int GPReverse = 12;
    public static int GPQuickTurn = 12;
    public static int GPShoot = 2;
    
}
