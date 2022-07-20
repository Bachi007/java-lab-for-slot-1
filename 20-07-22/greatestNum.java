
class greatestNum{

public static void main(String args[])
{
	int num1=25,num2=30,num3=15;
	
	if(num1>num2)//cond 1
	{
		if(num1>num3)//cond 2
		{
			System.out.println(num1+" is greatest Number");
		}
		else{
			System.out.println(num3+" is greatest Number");
		}
	}
	else{
			if(num2>num3)//cond 3
			{
				System.out.println(num2+" is greatest Number");
			}
			else{
				System.out.println(num3+" is greatest Number");
			}
	}

}
}