package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.SimpleDrive;
import frc.robot.commands.SixBallSimple;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ChooseAuto extends CommandBase {
    private final Command simpleDrive = new SimpleDrive();
    private final Command sixBallSimple = new SixBallSimple();
    public SendableChooser<Command> autoChooser = new SendableChooser<Command>();

    public ChooseAuto() {
        autoChooser.setDefaultOption("SimpleDrive", simpleDrive);
        autoChooser.addOption("SixBallSimple", sixBallSimple);
        SmartDashboard.putData(autoChooser);
    }
}