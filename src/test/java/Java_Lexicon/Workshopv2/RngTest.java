package Java_Lexicon.Workshopv2;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class RngTest
{
private RandomNumberGen underTest;
private static final int NUMBER_OF_TESTS = 5000;


@Before
public void setup()
{
	underTest = RandomNumberGen.getInsance();
}

@Test
public void test_5000_numbers_in_given_range()
{
	
	int min = 10, max = 50;
	
	for(int i = 0; i < NUMBER_OF_TESTS; i++)
	{
		int randomNumber = underTest.getRandomIntBetween(min,max);
		assertTrue(randomNumber >= min && randomNumber <= 50);
		
	}
	
}

}
