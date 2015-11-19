
public class Conditionals
{

private static final int Score = 91;
private static final int FOR_LOOP_COUNT = 6;
private static final int WHILE_CONSTANT = 7;
private static final int DOWHILE_CONSTANT = 0;
public static void main(String argv [])
{
	System.out.println("Hello Class!");
	
	tryForStatement();
	tryMyIfStatement();
	tryWhileLoop();
	tryDoWhile();
}

private static void tryDoWhile() 
{
	
}

private static void tryWhileLoop() 
{	
		int i=0;
		while(i<WHILE_CONSTANT)
	{
		System.out.println("While count is:" +i);
		i++;
	}
}

private static void tryForStatement() 
{	
	for	(int i = 0; i<FOR_LOOP_COUNT; i++)
	{
		System.out.println("For loop var: " +i);
	}
System.out.println("We are trying for an A");	
}

private static void tryMyIfStatement() {
	if (Score > 90)
	{
		System.out.println("We have an A class");
	}
	else
	{
		System.out.println("We don't have an A class");
	}
}
}	
