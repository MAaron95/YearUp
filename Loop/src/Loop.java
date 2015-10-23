
public class Loop {

	public static void main(String[] args) {
		
		int i  = 10;
		System.out.println("While loop count down");
		
		while (i > 0)
		{
			System.out.println(i);
			
			if (i == 5)
			{
				break;
			}
			
			i = i - 1;
		}
		System.out.println("For loop count down");
			{
		for(int I = 10; I > 0; I--);
		}
			
	}
}