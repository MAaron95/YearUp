
public class Intro {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("My name is Mark.");
		System.out.println("My favorite movie is The Wood.");
		System.out.println("I play basketball every chance I get.");
		//The method below adds some numbers
		Add ();
		//The method below adds some numbers but i doesn't return anyhing
		Add(6, 8);
		/*The method below adds 2 numbers
		 *  it returns the sum of the 2 numbers
		 */
		int sumFromMethod = AddWithReturn(40, 60);
		System.out.println("Sum from Add method in my main method" + sumFromMethod);
	}
	
	public static void Add()
	{
		int a = 5;
		int b = 6;
		int sum = a + b;
		System.out.println("Sum is " + sum);
	}

	public static void Add(int a, int b)
	{
		int sum = a + b;
		System.out.println("Sum with input is " + sum);
	}

	public static int AddWithReturn(int a, int b)
	{
		int sum = a +b;
		return sum;
	}
	}