package GUI;
import java.awt.event.ActionListener;

/**
 * This is the GUI class that handles every graphical interaction
 * 
 * @author Gustav
 * @version 2016-02-09
 */


public class GUI
{
	
	private IngameMenu ingameMenu;
	private GameView gameView;
	private StartupMenu startupMenu;
	private MainWindow mainWindow;

	
	/**
	 * Constructor that creates the different parts but only show the (empty) main window.
	 * 
	 * @param AL		The ActionListener that handles the events created
	 */
	public GUI(ActionListener AL)
	{
		System.out.println("GUI: started");

		mainWindow = new MainWindow(AL);
		gameView = new GameView();
		startupMenu = new StartupMenu();
		ingameMenu = new IngameMenu();
	}
	

	/**
	 * Shows the startup menu
	 * 
	 * @param AL		The ActionListener that handles the generated events..
	 */
	public void showStartupMenu(ActionListener AL)
	{
		startupMenu.addActionListener(AL);
		mainWindow.addGameComponent(startupMenu,MainWindow.MENULAYER);
	}
	
	
	/**
	 * removes the startup menu from the main window.
	 */
	public void hideStartupMenu()
	{
		mainWindow.remove(startupMenu);
	}
	
	
	/**
	 * Shows the ingame menu. Not implemented!
	 * 
	 * @param AL		The ActionListener that handles the generated events..
	 */
	public void showIngameMenu(ActionListener AL)
	{
		startupMenu.addActionListener(AL);
		mainWindow.addGameComponent(startupMenu,MainWindow.GAMEMENULAYER);
	}

	
	/**
	 * removes the ingame menu from the main window.
	 */
	public void hideIngameMenu()
	{
		mainWindow.remove(ingameMenu);
	}
	
	
	/**
	 * Shows a Game in which everything happens. Can send actions to an {@link ActionListener} (the controller)
	 * the actions are: accelerate in different directions with different forces and to stop accelerating.
	 * maybe also on click a one time acceleration "pulse".
	 * 
	 * @param AL	The Actionlistener to which the game sends its actions
	 */
	public void showGame(ActionListener AL)
	{
		gameView.addActionListener(AL);
		mainWindow.addGameComponent(gameView, MainWindow.GAMELAYER);
	}
	
	
	/**
	 * Hides the game.
	 */
	public void hideGame()
	{
		mainWindow.remove(gameView);
	}
	
}


