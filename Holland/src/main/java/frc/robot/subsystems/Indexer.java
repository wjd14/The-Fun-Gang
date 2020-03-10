/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.commands.*;

/**
 * Add your docs here.
 */
public class Indexer extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private WPI_VictorSPX Indexer;

  public Indexer() {

    Indexer = new WPI_VictorSPX(8);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new indexerDoNothing());
  }
  public void spinIndexer(double wheelSpeed){
    Indexer.set(wheelSpeed);
  }
  
}
