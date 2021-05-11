/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;


public class AutoTest2 extends SequentialCommandGroup {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

    public static final double DriveDist = 125; //scale 106%
  
    public AutoTest2() {
      addCommands(
          new DriveArc(55, -90), //90 degree circle counterclockwise
          new DriveArc(15, 80), //90 degree circle clockwise
          new DriveDistance(120), //move forward 125 inches
          new DriveArc(35, 85),  //90 degree circle clockwise
          new DriveArc(45, -360), //full circle 360 degrees 
          new DriveArc(35, 80), //90 degree circle counterclockwise
          new DriveDistance(125), //move forward 125 inches
          new DriveArc(15, 80), //90 degree circle clockwise
          new DriveArc(45, -90)  //90 degree circle counterclockwise
          ); 
      }   
  }