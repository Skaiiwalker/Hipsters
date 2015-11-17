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
//	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
//		this.hipsterBooks = new Book[3];
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
		
	}
	
	public Hipster(String name)
	{
		
	}
	
	public String getName()
	{
		return "name";
	}
	
	public String [] getHipsterPhrases()
	{
		return 
	}
}
