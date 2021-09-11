

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