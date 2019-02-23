
public class catrunner {
public static void main(String[] args) {
	/* Do the following things without changing the Cat class */

	// Create a CatRunner class with a main method that creates a Cat object.

	Cat catObject = new Cat("Tom");
	
    // 1. Make the Cat meow
	catObject.meow();
	// 2. Get the Cat to print it's name
	catObject.printName();
	// 3. Kill the Cat!
	for(int x = 0; x<10; x++)
	catObject.kill();

	
	
	
	
	
}
}
