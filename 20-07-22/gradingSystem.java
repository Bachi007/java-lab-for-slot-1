class gradingSystem
{
	public static void main(String args[])
	{
		int score=22;
		//grading based on score
		if(score>=35 && score<=50)
		{
			System.out.println("E grade");
		}
		else if(score>50 && score<=60)
		{
			System.out.println("D grade");
		}
		else if(score>60 && score<=75)
		{
			System.out.println("C grade");
		}
		else if(score>75 && score<=85)
		{
			System.out.println("B grade");
		}
		else if(score>85 && score<=100)
		{
			System.out.println("A grade");
		}
		else{
			System.out.println("Invalid score");
		}
	}
	

}