package assignment2_1;

public class PyramidPatternNum {

	public static void main(String[] args) {
		int space=3;
		int num=1;
		for(int i=0  ; i<4;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print("  ");
			}
			for(int j =0 ;j<i*2+1;j++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
			space--;
			num++;
		}

	}

}
