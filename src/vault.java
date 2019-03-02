
public class vault {
	static int secretcode = 10;
public static void main(String[] args) 

{
	//int secretcode = 12345;
	vault v = new vault();
	boolean answer = v.trycode(secretcode);
	System.out.println(answer);
	
}

public vault(int secretcode)
{
	this.secretcode = secretcode;
}

 boolean trycode(int number)
{
		//for(int i = 0; i<100000; i++)
		//{
			if(number == secretcode)
			{
				System.out.println("Correct " + number + " " + secretcode);
				return true;
			}
		
			
		//}
	
	return false;
}

}
