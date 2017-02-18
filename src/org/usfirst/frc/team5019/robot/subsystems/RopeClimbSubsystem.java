package org.usfirst.frc.team5019.robot.subsystems;

import org.usfirst.frc.team5019.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RopeClimbSubsystem extends Subsystem {
	protected Compressor itsCompressor;
	protected CANTalon itsLeftRoller;
	protected CANTalon itsRightRoller;
	protected Solenoid itsThreeWayValve;
	
	public RopeClimbSubsystem() {
		super("RopeClimbSubsystem");
		
		itsCompressor = new Compressor(RobotMap.kPCMCANID);
		itsCompressor.setClosedLoopControl(false);

		itsLeftRoller = new CANTalon(RobotMap.kLeftRollerMotorCANID);
		itsRightRoller = new CANTalon(RobotMap.kRightRollerMotorCANID);
		
		itsThreeWayValve = new Solenoid(RobotMap.kPCMCANID, RobotMap.kThreeWayValvePortID);
	}
	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
	public void climbRope( Joystick itsJoystick )
	{
		itsLeftRoller.set(itsJoystick.getRawAxis(RobotMap.kJoystickLTrigger));
		itsRightRoller.set(itsJoystick.getRawAxis(RobotMap.kJoystickLTrigger));
	}
    
    public Compressor getItsCompressor() {
    	return itsCompressor;
    }
    
    public CANTalon getItsLeftRoller() {
    	return itsLeftRoller;
    }
    
    public CANTalon getItsRightRoller() {
    	return itsRightRoller;
    }
    
    public Solenoid getItsThreeWayValve() {
    	return itsThreeWayValve;
    }
}

