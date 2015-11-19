package hipster.model;

public class Book 
{
	private int pageCount;
	private String author;
	private String subject;
	private String title;
	private double price;
	
	public Book()
	{
		this.pageCount = 0;
		this.author = "";
		this.subject = "";
		this.title = "";
		this.price = -0.00;
	}
	
	public Book(int pageCount, String author, String subject, String title, double price)
	{
		this.pageCount = pageCount;
		this.author = author;
		this.subject = subject;
		this.title = title;
		this.price = price;
	}
	
	public int getPageCount()
	{
		return pageCount;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPageCount(int pageCount)
	{
		
	}
	
	public void setAuthor(String author)
	{
		
	}
	
	public void setSubject(String subject)
	{
		
	}
	
	public void setTitle(String title)
	{
		
	}
	
	public void setPrice(Double price)
	{
		
	}
}
