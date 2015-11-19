package hipster.model;

/**
 * 
 * @author Luke Barrowes
 * @version 1.0 
 */
public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "I don't mean to sound like a hipster, but, ";
		hipsterPhrases[2] = "Insert sarcastic phrase here";
		hipsterPhrases[3] = "I was into XXXXX before it was cool";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		firstBook = new Book();
		firstBook.setAuthor("Brandon Sanderson");
		firstBook.setTitle("Way of Kings");
		firstBook.setSubject("Fantasy");
		firstBook.setPageCount(1070);
		firstBook.setPrice(23.47);
		
		secondBook = new Book();
		secondBook.setAuthor("Brandon Sanderson");
		secondBook.setTitle("Words of Radiance");
		secondBook.setSubject("Fantasy");
		secondBook.setPageCount(1070);
		secondBook.setPrice(19.33);
		
		thirdBook = new Book(300, "Sir Arthur Conan Doyle", "The Adventures of Sherlock Holmes", "Mystery", 7.99);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[3] = thirdBook;
		
	}
	
	public Hipster(String name)
	{
		
	}
	
	public String getName()
	{
		return "name";
	}
	
	public void setName(String name)
	{
		
	}
	
	public String [] getHipsterPhrases()
	{
		return hipsterPhrases;
	}
	
	public void setHipsterBooks(Book[] hipsterBooks)
	{
		
	}
}

