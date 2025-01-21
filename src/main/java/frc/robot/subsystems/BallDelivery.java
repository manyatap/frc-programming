// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class BallDelivery extends SubsystemBase{

  private Victor leftMotor = newVictor(Constants.leftMotor);
  private Victor rightMotor = newVictor(Constants.rightMotor);

  private DoubleSolenoidToggler pistons = Constants.pistons;

  public void power (double speed) {
    if (speed>1)speed=1;
    if (speed<-1)speed=-1;

    if(Math.abs(speed))>

    leftMotor.set(speed);
    rightMotor.set(-speed);
  }

}

 