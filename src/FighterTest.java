import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FighterTest {

	@Test
	void testToString() {
		   Robot F1 = new Robot("Fighter KYLE", 10);
	        Robot F2 = new Robot("Fighter UNDER", 10);
	}
	
	void testFfight() {
		 Robot F1 = new Robot("Fighter KYLE", 10);
	        Robot F2 = new Robot("Fighter UNDER", 10);
	        Fighter F = new Fighter(F1, F2);
	        F.fight(F1, F2);
	}

}
