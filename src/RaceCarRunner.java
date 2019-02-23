import javax.swing.JOptionPane;

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar racecarObject = new RaceCar("Ferrari", 5);
		// 2. Print the RaceCar's position in the race
		System.out.println("You are in 5th place.");
		// 3. Crash the RaceCar
		racecarObject.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
		racecarObject.pit();
		// 5. Help the car move into first place.
		for(int x = 0; x < 7; x++)
			racecarObject.overtake();
		
	}
}
