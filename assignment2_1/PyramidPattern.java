package assignment2_1;

public class PyramidPattern {

	public static void main(String[] args) {
		int space=3;
		for(int i = 0 ;i < 4 ; i++)
		{
			for(int k = 1 ; k <= space ; k++)
			{
				System.out.print("  ");
			}
			for(int j = 0 ; j <i*2+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}

	}

}
