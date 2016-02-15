package util;

/**
 * Internal class making commands sent through events more readable and makes sure that they are unique.
 * @author Gustav
 */

/*
 * Comment
 * This should be remade as a subclass to ActionListener which is extensively used in this project. 
 * Maybe then renamed to GameAction?
 */

public class Command {

	public static String
		ESC_PRESSED = "ESC pressed",
		WINDOW_CLOSED = "Window closed",
		RETURN_TO_GAME = "Return to game",
		SAVE_GAME = "Save game",
		EXIT_GAME = "Exit game",
		START_NEW_GAME = "Start new game",
		LOAD_GAME = "Load game",
		EXIT = "Exit",
		MOUSE_PRESSED = "Mouse pressed",
		MOUSE_RELEASED = "Mouse released",
		MOUSE_DRAGGED = "Mouse dragged",
		ZOOM_IN = "Zoom in",
		ZOOM_OUT = "Zoom out";
	
	//public Command () {}

}