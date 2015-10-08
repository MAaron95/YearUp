import java.util.Scanner;

public class TipCalculator
{

	public static void main(String[] args) 
	{
		//This shows me to enter the amount through the string
		System.out.println("Enter the amount for the check:");
		//Looks at what your input
		Scanner sc = new Scanner(System.in);
		//Stores your input, ("sc") 
		double checkAmount = sc.nextDouble();
		//These are the methods being called with the variable
		double tenPercent = tenpercent(checkAmount);
		double fifteenPercent = fifteenpercent(checkAmount);
		double twentyPercent = twentypercent(checkAmount);
		System.out.println("Your 10, 15, and 20 tips are " + tenPercent + " 15 percent " + fifteenPercent + " and 20 percent " + twentyPercent);
		
	}
	//These are the methods
public static double tenpercent(double amt) {
	double total = (amt * .1) +amt;
	return total;
}
public static double fifteenpercent(double amt) {
	double total = (amt * .15) + amt;
	return total;
}
public static double twentypercent(double amt) {
	double total = (amt * .2)+amt;
	return total;
}

}
