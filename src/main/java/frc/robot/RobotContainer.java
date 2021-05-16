/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
// import frc.robot.Constants.*;
// import edu.wpi.first.wpilibj.util.Color;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public static DiskControl DiskControlT = new DiskControl();
  public static Navx NavxT = new Navx();
  public static Drivetrain DrivetrainT = new Drivetrain();
  public static Pneumatics PneumaticsT = new Pneumatics();
  public static ShooterLimelight ShooterLimelightT = new ShooterLimelight();
  public static Intake IntakeT = new Intake();
  public static Indexer IndexerT = new Indexer();
  public static Climb ClimbT = new Climb();
  public static Shooter ShooterT = new Shooter();
  //public static Lights LightsT = new Lights();

  public static XboxController m_driverController = new XboxController(0);
 
  public static Joystick m_joystick = new Joystick(1);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    DrivetrainT.setDefaultCommand(new DriveWithJoystick());
    IntakeT.setDefaultCommand(new ControlIntake());
    ShooterT.setDefaultCommand(new TurretWithJoystick());
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //final JoystickButton a = new JoystickButton(m_joystick, 1);
    //final JoystickButton b = new JoystickButton(m_joystick, 2);
    // final JoystickButton x = new JoystickButton(m_joystick, 3);
    final JoystickButton leftBumper = new JoystickButton(m_joystick, 4);
    final JoystickButton climbButtonUp = new JoystickButton(m_driverController, 8);
    final JoystickButton climbButtonDown = new JoystickButton(m_driverController, 7);

    //a.whenPressed(new GoToColor());
    //b.whenPressed(new SpinTimes());
    //x.whenPressed(new AutoTest());
    leftBumper.toggleWhenPressed(new TargetPort());
    climbButtonUp.whenPressed(new SetClimb(true));
    climbButtonDown.whenPressed(new SetClimb(false));
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return new BarrelRunTest(); //.withTimeout(20);
  }
}
