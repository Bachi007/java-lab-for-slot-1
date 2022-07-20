class variableTypes {
	static double pi=3.17;//static variable
public static void main(String args[])
{
	int a=5,b=6;//local variables 
	int c=a+b;
	System.out.println("Addition of" +a+" and "+b+" is "+c);
	//Addition of 5 and 6 is 11;
	variableTypes vt=new variableTypes();//object creation
	System.out.println(" PI value is"+pi);
	vt.display();//method calling
}
public void display(){
	
	System.out.println(" PI value is"+pi);
	
}


}