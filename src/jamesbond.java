import javax.swing.JOptionPane;

public class jamesbond {
	
public static void main(String[] args) {
	vault v = new vault(99);
	
	
	//boolean answer = v.trycode(12345);
	
	//System.out.println(answer);
	findcode(v);
	
}


static void findcode(vault v)
{
	boolean ans = false;
	
	for(int i = 0; i<100000; i++)
	{
		 ans = v.trycode(i);
		 
		 System.out.println(ans);
		
		if(ans == true)
		{
			System.out.println("The secretcode is " + i);
			break;
		}
		
	}
	
		
}
}
