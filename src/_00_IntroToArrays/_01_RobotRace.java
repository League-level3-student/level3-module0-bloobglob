package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		Thread[] threads = new Thread[robots.length];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i < robots.length; i++) {
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i] = new Robot();
			robots[i].setSpeed(100);
			robots[i].moveTo(i*100+100, 500);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	for(int i = 0; i < threads.length; i++) {
    		int index = i;
    		threads[i] = new Thread(()->{
    			while(robots[0].getY() > 0 && robots[1].getY() > 0 && robots[2].getY() > 0 && robots[3].getY() > 0 && robots[4].getY() > 0) {
    				robots[index].move(new Random().nextInt(50));
    			}
    	    	for(int j = 0; j < threads.length; j++) {
    	    		if(robots[j].getY()<0) {
    	    			JOptionPane.showMessageDialog(null, "Robot " + (j+1) + " won!");
    	    		}
    	    	}
    		});
    	}
    	for(int i = 0; i < threads.length; i++) {
    		threads[i].start();
    	}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
