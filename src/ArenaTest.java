import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArenaTest {
	Robot R1, R2;
	@Test
	void testToString() {
		 Robot R1 = new Robot("Robot D2R2", 10);
         Robot R2 = new Robot("Robot Data", 10);
	}
	void testFire() {
		  Robot bob = new Robot("Robot bob", 10);
	        System.out.println(bob.nom);
	        Robot R1 = new Robot("Robot foo", 10);
	        Robot R2 = new Robot("Robot bar", 10);
	        R1.fire(R2);
	}
	
}



