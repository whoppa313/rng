package Java_Lexicon.Workshopv2;

import java.util.Random;

public class RandomNumberGen 
{
	
	
	
	private static Random rng;
	
	private static RandomNumberGen instance;
	
	static 
	{
		rng = new Random();
		instance = new RandomNumberGen();
	}
	
	
	private RandomNumberGen() {}
	
	public static RandomNumberGen getInsance()
	{
		return instance;
	}
	
	
	/**
	 * This method will return a number in between the range of min and max. 
	 * @param min int representing the lowest possible number
	 * @param max int representing the highest possible number
	 * @return random int between min and max
	 */
	public int getRandomIntBetween(int min, int max)
	{
		
		return rng.nextInt(max-min) + min;
		
	}
	
	
	
	
	
	
	
	
}
