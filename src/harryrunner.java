
public class harryrunner {
public static void main(String[] args) {
	// Create a HarryRunner class with a main method that:
			// 1. makes harry potter
			// 2. become invisible
			// 3. spy on Professor Snape
			// 4. become visible again
			// 5. cast a “stupefy” spell

	HarryPotter potterObject = new HarryPotter();
	
	potterObject.makeInvisible(true);
	potterObject.spyOnSnape();
	potterObject.makeInvisible(false);
	potterObject.castSpell("stupefy");
	
}
}
