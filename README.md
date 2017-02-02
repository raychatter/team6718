# Deploying Code to the Robot
3. Plug the USB cord into the robot and computer, and make sure the robot is
   turned on.
1. Write the code in python and save the file as `robot.py`
    * Writing robotpy code: http://robotpy.readthedocs.io/en/stable/guide/anatomy.html#create-your-robot-code
    * Learning Python (for free!): https://learnpythonthehardway.org/book/
2. Open the Command Prompt and "change directory" to the location where you saved the `robot.py` file.
   For example, if the file is saved on the desktop, you would type the command `cd Desktop`
3. Copy the file to the robot using the command `scp robot.py lvuser@roborio-6718-frc.local:/home/lvuser/py`
4. Login to the robot using the command `ssh lvuser@roborio-6718-frc.local`
5. "Change directory" to the one that contains the robot.py file with the command `cd /home/lvuser/py`
5. Run the code with the command `python3 robot.py run`
    * Resource: http://robotpy.readthedocs.io/en/stable/dev/deploy.html#manual-code-deploy
6. Open the FRC Drivers Station program and click "Start" to run the code.
