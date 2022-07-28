/*reading the values into multidimensional arrays
by @bhaskaraacharya
*/
import java.util.Scanner;
class multiArray
{

public static void main(String args[])
{
	int rows,cols,i,j,k;
	Scanner bs=new Scanner(System.in);//scanner object
	System.out.print("Enter number of rows : ");
	rows=bs.nextInt();
	System.out.print("Enter number of Cols : ");
	cols=bs.nextInt();
	//creating array with specified size
	int ar[][]=new int[rows][cols];
	int br[][]=new int[rows][cols];
	int cr[][]=new int[rows][cols];
	//reading values of first array
	System.out.println("Enter values of first array");
	for(i=0;i<rows;i++)//rows
	{
		for(j=0;j<cols;j++)//cols
		{
			ar[i][j]=bs.nextInt();
		}
	}
	System.out.println("Enter values of second array");
	//reading values of second array
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)//cols
		{
			br[i][j]=bs.nextInt();
		}
	}
	//multiplication of two arrays 
	
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)//cols
		{
			cr[i][j]=0;
			for(k=0;k<cols;k++)
			{
				cr[i][j]+=ar[i][k]+br[k][j];
			}
				System.out.print(cr[i][j]+" ");
		}
		System.out.println(" ");
	}
	
	
	//printing values of result
		System.out.println("Multiplication of those arrays are");
	for(i=0;i<rows;i++)//rows
	{
		for(j=0;j<cols;j++)//cols
		{
			// System.out.print(cr[i][j]+" ");
		}
		//System.out.println(" ");

	}
	bs.close();
}
}
