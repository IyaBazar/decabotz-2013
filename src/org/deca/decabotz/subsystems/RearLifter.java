/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.deca.decabotz.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Sciencelab
 */
public class RearLifter extends Subsystem {
    private Solenoid lift;
    private Solenoid retract;
    
    public RearLifter() {
        lift = new Solenoid(channel);
    retract = new Solenoid (channel);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
   
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new org.deca.decabotz.commands.RearLift());
    }
   
}
