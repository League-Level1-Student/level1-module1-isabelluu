
public class duck {
	
	String favoriteFood;
	int numberOfFriends;
	
	static duck friend = new duck("kale", 6);


public static void main(String[] args) {
	
	duck(friend);
	waddle();
	quack();
	
}

private static void duck(duck friend2) {
	// TODO Auto-generated method stub
	
}

public duck(String favoriteFood, int numberOfFriends) {
	
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
      	
      	System.out.println("My favorite food is " + favoriteFood);
    	System.out.println("I have " + numberOfFriends + " friends");
}

static void quack()
{
	System.out.println("quack ");
}

static void waddle()
{
	System.out.println("waddle ");
}
}
