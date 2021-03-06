package org.usfirst.frc.team5019.robot.commands;

import org.usfirst.frc.team5019.robot.Robot;
import org.usfirst.frc.team5019.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearUnload extends Command {

    public GearUnload() {
    	requires(Robot.getItsGearArmSubsystem());
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.getItsGearArmSubsystem().getItsGearArmMotor().setSpeed(0.50);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.getItsGearArmSubsystem().getItsGearArmMotor().setSpeed(0.50);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.getItsGearArmSubsystem().getItsGearArmMotor().setSpeed(0.50);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
