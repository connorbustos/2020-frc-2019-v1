package frc.robot.subsystems;

public class Drive {

    private static Drive mInstance = null;

    public static Drive getInstance() {
        if (mInstance == null) {
            mInstance = new Drive();
        }
        return mInstance;
    }

    //speed controllers, private final

    private Drive() {

    }

}
