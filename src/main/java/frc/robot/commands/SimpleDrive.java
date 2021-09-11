package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class SimpleDrive extends SequentialCommandGroup {
    @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
    public SimpleDrive() {
        addCommands(
            new DriveDistance(60)
        );
        
    }

}