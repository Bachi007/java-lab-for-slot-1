class library{
	
	public static void main(String args[])
	{
			bookShell book1=new bookShell();
			book1.setBook(101,"Blue Umberlla",81);
			bookShell book2=new bookShell();
			book2.setBook(102,"MindSet",150);
			book1.getBook();
			book2.getBook();
	}
	
}

class bookShell{
	
	private int bookNum,bookPrice;
	private String bookName;
	//adding new book to bookShell
	public void setBook(int bNum,String bName,int bPrice)
	{
			bookNum=bNum;
			bookName=bName;
			bookPrice=bPrice;
	}
	
	//to print details of book
	
	public void getBook(){
		System.out.println(bookNum+" is the "+bookName+" and its price is "+bookPrice);
	//121 is the rich dad poor dad and its price is 250rs;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
