package org.usfirst.frc.team5019.robot.subsystems;

import org.usfirst.frc.team5019.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RopeClimbSubsystem extends Subsystem {
	protected Compressor itsCompressor = new Compressor(
			RobotMap.kCompressorCANID);
	protected CANTalon itsLeftRoller = new CANTalon(
			RobotMap.kLeftRollerMotorCANID);
	protected CANTalon itsRightRoller = new CANTalon(
			RobotMap.kRightRollerMotorCANID);
	protected Solenoid itsThreeWayValve = new Solenoid(
			RobotMap.kThreeWayValveID);

	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
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

