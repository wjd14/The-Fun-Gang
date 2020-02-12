/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Add your docs here.
 */
public class crossinitiationandgotothebottomleftcorner extends CommandGroup{
    public crossinitiationandgotothebottomleftcorner(){

        addSequential(new gotobottomleftcorner());
        addSequential(new Turnleft(0.5));
        addSequential(new crossInitiation(2));

    }
    


}
