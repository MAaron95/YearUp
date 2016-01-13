import static org.junit.Assert.*;
import org.junit.Test;

public class ConcatenateTest 
{
	@Test
	public void testConcatenateTwo() 
	{
		Concatenate concat = new Concatenate();
		
		String resultOne = concat.ConcatenateTwo("star ", "wars");
		assertEquals(resultOne, "star wars");
		
		String resultTwo = concat.ConcatenateTwo(null, null);
		assertEquals(resultTwo, "nullnull");
	}

	@Test
	public void testConcatenateThree()
	{
		Concatenate concat = new Concatenate();
		
		String resultOne = concat.ConcatenateThree("Year ", "Up ", "Atlanta");
		assertEquals(resultOne, "Year Up Atlanta");
		
		String resultTwo = concat.ConcatenateThree("", "", "");
		assertEquals(resultTwo, "");
	}
}
