import javax.swing.JOptionPane;

public class popcornMaker {
public static void main(String[] args) {
	Microwave popcornObject = new Microwave();
	popcornObject.putInMicrowave(null);
	
	String popflavor = JOptionPane.showInputDialog("What flavor is the popcorn?");
	String ctime = JOptionPane.showInputDialog("How long should we cook the popcorn(in minutes)?");
	int cookTime = Integer.parseInt(ctime);
	popcornObject.setTime(cookTime);
	popcornObject.startMicrowave();

	Popcorn popObject = new Popcorn(popflavor);
	popObject.eat();
	popObject.applyHeat();
	
	
}
}
