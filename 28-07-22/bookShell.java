class bookShell{

	int bookNum,bookPrice;
	String bookName;
	
	//adds new book to the bookShell
	public void setBook(int bnum,String bname,int bprice){
	
		bookNum=bnum;
		bookName=bname;
		bookPrice=bprice;
	}
	
	//prints bookDetails
	public void getBook(){
	
	System.out.println(bookNum+" is the book number of "+bookName+"its price is"+bookPrice);
	}

}