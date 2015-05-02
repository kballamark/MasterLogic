package MasterLogic;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
																//This class creates the places of the mushrooms. It's called in the StartHandler class. 
																//

public class Colours_Guessed 
	{

	StartHandler startHandler_1;
	
	ImageIcon selectedGuess = new ImageIcon(Colour.class.getResource("selectedGuess.png"));
	
	public Colours_Guessed(StartHandler s)
	{
		startHandler_1 = s;
		createSelectedButtons();
		
	}

	JToggleButton placeButtons[] = new JToggleButton[6];		//creates the array of places (It's maximum size is 6)
	
	
	public void createSelectedButtons() 
	{

		for(int i=0;i<6;i++)
		{
			placeButtons[i] = new JToggleButton("");
		}
		
		for(int i=0;i<StartScreen.numOfPlaces;i++)
		{
			
		    //placeButtons[i].setText(Integer.toString(i+1));
		    placeButtons[i].setSize(60, 80);
		    placeButtons[i].setLocation(260+i*60, 100);								
		    placeButtons[i].setBackground(Color.darkGray);							
		    placeButtons[i].setForeground(Color.BLACK);
		    placeButtons[i].setSelectedIcon(selectedGuess);
		    startHandler_1.gameWindow.add(placeButtons[i]);
	
		} 
	}
	

	
	}
	
	

