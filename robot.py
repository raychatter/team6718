#!/usr/bin/env python3

import wpilib

class MyRobot(wpilib.IterativeRobot):

  def robotInit(self):
    self.motorLeft = wpilib.Spark(1)
    self.motorRight = wpilib.Spark(2)
  
  def autonomousInit(self):
    self.auto_loop_counter = 0

  def autonomousPeriodic(self):
    """ See if we've completed 100 loops (approximately 2 seconds)"""
    if self.auto_loop_counter < 100:
      self.motorLeft.set(1)
      self.motorRight.set(1)
      self.auto_loop_counter += 1
    else:
      self.motorLeft(0)
      self.motorRight(0)

if __name__ == "__main__":
  wpilib.run(MyRobot)
