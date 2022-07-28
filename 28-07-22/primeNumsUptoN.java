/*
printing prime numbers upto n
*/
import java.util.Scanner;
public class primeNumsUptoN
{
	public static void main(String args[])
	{
		Scanner bs=new Scanner(System.in);//scanner object
		int num,limit,coef=0,i,j;//declaration
		
		System.out.println("Enter the limit to print primes");
		limit=bs.nextInt();
		System.out.println("----Prime numbers up to"+limit+"----");
		for(i=1;i<=limit;i++)//for prime numbers
		{
			coef=0;
			for(j=1;j<=i;j++)//finding coeff
			{
				//check coeff`
				if(i%j==0)
				{
					coef++;
				}
			}
			if(coef==2)//if coef==2 then its prime
			{
				System.out.println(i);
			}


		}
		
		bs.close();//closing scanner
	}

}