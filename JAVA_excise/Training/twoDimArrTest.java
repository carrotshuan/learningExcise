public class twoDimArrTest
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][3];
	
		for (int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				arr[i][j] = (int)(Math.random()*100);
			}
		}
		for (int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
				System.out.println("Arr ["+i+"]["+j+"] = " + arr[i][j]);
		}
	}
}
