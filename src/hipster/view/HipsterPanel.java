package hipster.view;

import hipster.controller.HipsterAppController;
import javax.swing.*;
import java.awt.Color;
import hipster.model.Book;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClicks;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
		bookAuthorLabel = new JLabel("The author");
		bookPriceLabel = new JLabel("The price");
		bookSubjectLabel = new JLabel("The subject");
		bookTitleLabel = new JLabel("The Title");
		bookPageCountLabel = new JLabel("The page count");
		phraseComboBox = new JComboBox<String>();
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		startClicks = 0;
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
		this.add(bookAuthorLabel);
		this.add(phraseComboBox);
		this.add(bookPageCountLabel);
		this.add(bookTitleLabel);
		this.add(bookPriceLabel);
		this.add(bookSubjectLabel);
		this.add(changeBookButton);
	}
	
	private void changeColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		setBackground(new Color(red, green, blue));
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				changeColor();
				String updatedTitle = phraseComboBox.getSelectedItem()toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		});
		
		changeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book [] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClicks < maxClicks)
				{
					changeColor();
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClicks].getSubject());
					bookAuthorLabel.setText("Book author: " + tempBooks[startClicks].getAuthor());
					bookTitleLabel.setText("Book title: " + tempBooks[startClicks].getTitle());
					bookPageCountLabel.setText("Book Pages: " + tempBooks[startClicks].getPageCount());
					bookPriceLabel.setText("Book price: " + tempBooks[startClicks].getPrice());
					startClicks++;
				}
				else
				{
					startClicks = 0;
					bookSubjectLabel.setText("Book Subject: ");
					bookAuthorLabel.setText("Book author: ");
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("Book pages: ");
					bookPriceLabel.setText("Book Price: ");
				}
			}
		});
	}
}
