/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


/**
 * Add your docs here.
 */
public class Shooter extends Subsystem {

  private WPI_TalonSRX Left;
  private WPI_TalonSRX Right;
  private WPI_VictorSPX Indexer;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Shooter(){

    Left = new WPI_TalonSRX(9);
    Right = new WPI_TalonSRX(10);
    Indexer = new WPI_VictorSPX(8);

  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ShootTeleOp());
  }

  
  public void spinLeft(double wheelSpeed){
    Left.set(wheelSpeed);
  }
  public void spinRight(double wheelSpeed){
    Right.set(wheelSpeed);
  }
  public void spinIndexer(double wheelSpeed){
    Indexer.set(wheelSpeed);
  }
}