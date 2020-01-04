package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants;

public class Controls implements ControlsInterface {

    private static Controls mInstance = null;

    public static Controls getInstance() {
        if (mInstance == null) {
            mInstance = new Controls();
        }
        return mInstance;
    }

    private Controls() {

    }

    private final Joystick assistStick = new Joystick(Constants.assistStickPort);
    private final Joystick throttleStick = new Joystick(Constants.throttleStickPort);
    private final Joystick turnStick = new Joystick(Constants.turnStickPort);

    //up and down of the left joystick, used to control the speed of the robot
    @Override
    public double getThrottle() {
        return throttleStick.getY();
    }

    //Up and down of the right joystick
    @Override
    public double getTurn() {
        return turnStick.getY();
    }

    //Trigger button
    @Override
    public boolean getQuickTurn() {
        return turnStick.getRawButton(0);
    }

}
