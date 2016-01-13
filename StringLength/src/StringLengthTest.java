import static org.junit.Assert.*;

import org.junit.Test;

public class StringLengthTest
{
	@Test 
	public void TestLengthOfString()
	{
		Concatenate concat = new Concatenate();
		String lengthresultOne = concat.StringLength("Friday");
		assertEquals(lengthresultOne, "6");
	}
}
