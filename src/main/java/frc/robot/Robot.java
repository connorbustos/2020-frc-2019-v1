/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controls.Controls;
import frc.robot.subsystems.Drive;

public class Robot extends TimedRobot {

    private final Controls mControls = Controls.getInstance();
    private final Drive mDrive = Drive.getInstance();

    @Override
    public void robotInit() {
    }

    @Override
    public void autonomousInit() {
    }

    @Override
    public void autonomousPeriodic() {
    }

    //Runs ONCE before teleopPeriodic
    @Override
    public void teleopInit() {
        try {
            //Make LED Purple
            //Clear motion profile (arraylist)
        } catch (Throwable t) {
            throw t;
        }
    }

    //Runs every 20 ms, 50 iterations / second
    @Override
    public void teleopPeriodic() {
        try {
            userControlMode();
        } catch (Throwable t) {
            throw t;
        }
    }

    public void userControlMode() {

        double getThrottle = mControls.getThrottle();
        double getTurn = mControls.getTurn();
        boolean isQuickTurn = mControls.getQuickTurn();

        mDrive.curvatureDrive(getThrottle, getTurn, isQuickTurn);

    }

    @Override
    public void testInit() {
    }

    @Override
    public void testPeriodic() {
    }

}
