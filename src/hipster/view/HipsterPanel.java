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
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
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
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem()toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		});
	}
}
