/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.controls.Controls;

public class Robot extends TimedRobot {

    private final Controls mControls = Controls.getInstance();

    @Override
    public void robotInit() {
    }

    @Override
    public void autonomousInit() {
    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void teleopInit() {
    }

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

      //mDrive.drive(getThrottle, getTurn, isQuickTurn);

    }

    @Override
    public void testInit() {
    }

    @Override
    public void testPeriodic() {
    }

}
