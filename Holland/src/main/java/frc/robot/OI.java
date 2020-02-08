// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.*;
import frc.robot.subsystems.*;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
public JoystickButton leftturn;
public JoystickButton rightturn;
public Joystick leftjoystick;
public JoystickButton foldOutButton;
public JoystickButton foldInButton;
public Joystick rightJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

rightJoystick = new Joystick(1);

foldInButton = new JoystickButton(rightJoystick, 4);
foldInButton.whenPressed(new FoldInIntake(1));
foldOutButton = new JoystickButton(rightJoystick, 3);
foldOutButton.whenPressed(new FoldOutIntake(1));
leftjoystick = new Joystick(0);

rightturn = new JoystickButton(leftjoystick, 4);
rightturn.whenPressed(new Turnright(2.5));
leftturn = new JoystickButton(leftjoystick, 5);
leftturn.whenPressed(new Turnleft(2.5));


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("RunDrivetrain", new RunDrivetrain());
        SmartDashboard.putData("RunIntake", new RunIntake());
        SmartDashboard.putData("crossInitiation", new crossInitiation());
        SmartDashboard.putData("doNothing", new doNothing());
        SmartDashboard.putData("FoldInIntake", new FoldInIntake());
        SmartDashboard.putData("FoldOutIntake", new FoldOutIntake());
        SmartDashboard.putData("Turning", new Turning());
        SmartDashboard.putData("Turnleft", new Turnleft());
        SmartDashboard.putData("Turnright", new Turnright());
        SmartDashboard.putData("autoMoveAround", new autoMoveAround());
        SmartDashboard.putData("crossAndGoBack", new crossAndGoBack());
        SmartDashboard.putData("goBackwards", new goBackwards());
        SmartDashboard.putData("crossInitiationBack", new crossInitiationBack());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public Joystick getLeftjoystick() {
        return leftjoystick;
    }

public Joystick getRightJoystick() {
        return rightJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS




    public double GetLeftJoytickValue(){



        double left = leftjoystick.getRawAxis(1);
   
        return Math.signum(left)*Math.pow(left,2);

      
      }
      public double GetRightJoytickValue(){

        double Right = rightJoystick.getRawAxis(1);
   
        return Math.signum(Right)*Math.pow(Right,2);
      }
       
      public double GetYAxisValue(){
        double Yaxis=leftjoystick.getRawAxis(1);
        return Math.signum(Yaxis)*Math.pow(Yaxis,2);
        }
      public double GetXAxisValue(){
          double Xaxis=leftjoystick.getRawAxis(0);
          return Math.signum(Xaxis)*Math.pow(Xaxis,2);
    
      }
}

