package frc.robot.motion;

import java.util.ArrayList;
import java.util.List;

public class MotionTracker {

    private static MotionTracker mInstance = null;

    public static MotionTracker getInstance() {
        if (mInstance == null) {
            mInstance = new MotionTracker();
        }
        return mInstance;
    }

    private List<Double> leftSideSpeed;
    private List<Double> rightSideSpeed;

    private MotionTracker() {
        leftSideSpeed = new ArrayList<>();
        rightSideSpeed = new ArrayList<>();
    }

    public void addToBoth(double motorValue) {
        addToLeft(motorValue);
        addToRight(motorValue);
    }

    public void addToLeft(double motorValue) {
        leftSideSpeed.add(motorValue);
    }

    public void addToRight(double motorValue) {
        rightSideSpeed.add(motorValue);
    }

    public void clearAll() {
        leftSideSpeed.clear();
        rightSideSpeed.clear();
    }

}
