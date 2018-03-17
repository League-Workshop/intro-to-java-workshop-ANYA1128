package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Puppy =new Robot();
	Puppy.penDown();
	Puppy.setPenColor(0, 100, 150);
	Puppy.setSpeed(10000);
for(int i=0;i<10000;i++) {
Puppy.turn(1);
Puppy.move(1);
}
	
	
	
	
	
	
	
		
		
	}
}
