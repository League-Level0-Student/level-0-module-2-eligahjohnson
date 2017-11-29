package extra;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class ForLoopFun { 
	public static void main(String[] args) {
	
	Robot Ezra = new Robot ();
	Random Juju = new Random();
	
	Ezra.penDown();
	Ezra.setSpeed(100);

    for (int i = 0; i <10; i++) {
    	int Ju1 = Juju.nextInt(501);
    Ezra.move(Ju1);
    Ezra.turn(Ju1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
