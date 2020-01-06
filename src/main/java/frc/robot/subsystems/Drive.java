package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;

public class Drive {

    private static Drive mInstance = null;

    public static Drive getInstance() {
        if (mInstance == null) {
            mInstance = new Drive();
        }
        return mInstance;
    }

    //speed controllers, private final
    private final PWMVictorSPX leftMaster, leftSlave, rightMaster, rightSlave;
    private final SpeedControllerGroup leftSideControllerGroup, rightSideControllerGroup;
    private final DifferentialDrive drive;

    private Drive() {

        leftMaster = new PWMVictorSPX(Constants.leftDriveMasterId);
        leftSlave = new PWMVictorSPX(Constants.leftDriveSlaveId);
        rightMaster = new PWMVictorSPX(Constants.rightDriveMasterId);
        rightSlave = new PWMVictorSPX(Constants.rightDriveSlaveId);

        leftSideControllerGroup = new SpeedControllerGroup(leftMaster, leftSlave);
        rightSideControllerGroup = new SpeedControllerGroup(rightMaster, rightSlave);

        drive = new DifferentialDrive(leftSideControllerGroup, rightSideControllerGroup);

    }

    public void curvatureDrive(double throttle, double turn, boolean isQuickTurn) {
        drive.curvatureDrive(throttle, turn, isQuickTurn);
    }

    public double getLeftSideSpeed() {
        return leftSideControllerGroup.get();
    }

    public double getRightSideSpeed() {
        return rightSideControllerGroup.get();
    }

}
