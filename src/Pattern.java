
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Star pattern
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		
		/**
		 * Star pattern
		 * *****
		 * ****
		 * ***
		 * *
		 */
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("**********new vesion***************");
		for(int i=0;i<=4;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("*****************************************");
		
		
	}

}
