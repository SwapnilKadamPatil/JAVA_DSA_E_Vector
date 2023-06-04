package JavaDSA_Swapnil.com;

public class Pattern_Star {

	public static void main(String[] args) 
	{
		int row, NumberOfStars;
		
		for (row = 1; row <= 10; row++)
		{
			for(NumberOfStars = 1; NumberOfStars <= row ; NumberOfStars ++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
