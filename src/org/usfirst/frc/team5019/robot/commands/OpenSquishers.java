package org.usfirst.frc.team5019.robot.commands;

import org.usfirst.frc.team5019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OpenSquishers extends Command {
	

    public OpenSquishers() {
        super();
        requires(Robot.getItsRopeClimbSubsystem());
        
        Robot.getItsRopeClimbSubsystem().getItsThreeWayValve().set(false);

    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.getItsRopeClimbSubsystem().getItsThreeWayValve().set(true);
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() { 
    	Robot.getItsRopeClimbSubsystem().getItsThreeWayValve().set(false);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() { 
    	end();
    }
}
