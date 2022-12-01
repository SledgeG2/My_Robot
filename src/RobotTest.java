import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RobotTest {

	@Test
	void testToString() {
		Robot bob = new Robot("Robot bob", 10);
        System.out.println(bob.nom);

  
	}
	void testArena() {
		Robot R1 = new Robot("Robot foo", 10);
        Robot R2 = new Robot("Robot bar", 10);
        R1.fire(R2);
}
	
}