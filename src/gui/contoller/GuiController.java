package gui.contoller;

import gui.view.GUIFrame;

/**
 * GUIController for the twoDimensional GUI
 * @author mhal4767
 *@ version 0.x February 2016
 */

public class GuiController
{
/**
 * reference to the GUIFrame object for the internal use 
 */
	private GUIFrame baseFrame;
	/**
	 * Creates a GUIController and initializes the GUIFrame.
	 */
	
	public  GUIController()
	{
		baseFrame =new GUIFrame(this);
	}
	
	public void start()
	{
		
	}
	
}
