package org.usfirst.frc.team5019.robot.commands;

import org.usfirst.frc.team5019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RunCompressor extends Command {

    public RunCompressor() {
      requires(Robot.getItsRopeClimbSubsystem());
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.getItsRopeClimbSubsystem().getItsCompressor().setClosedLoopControl(true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (Robot.getItsRopeClimbSubsystem().getItsCompressor().getPressureSwitchValue() == false) {
    		return true;
    	} else {
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.getItsRopeClimbSubsystem().getItsCompressor().setClosedLoopControl(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
