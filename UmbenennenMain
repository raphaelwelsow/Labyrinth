import java.awt.event.KeyEvent;
import ledControl.BoardController;
import ledControl.LedConfiguration;
import ledControl.gui.KeyBuffer;
import java.awt.event.KeyEvent;

public class UmbenennenMain {

	 private static BoardController controller;
	 private static KeyBuffer buffer;
	 private static int xPos, yPos;
	 public static int[]posi = new int[2];

	public static void main(String[] args) {
		//größeres Board falls gewünscht
		BoardController.getBoardController(LedConfiguration.LED_20x20_EMULATOR);
		BoardController controller = BoardController.getBoardController();
		
		Sammlung.SammlungErstellen();
		controller = BoardController.getBoardController();
		buffer = controller.getKeyBuffer();
		
		//Startposition des Punktes festlegen
		
		LabyrinthElement aktLabyrinth = Sammlung.main.getLabyrinth(0);
		posi = aktLabyrinth.getStart();//übergibt den Startwert (x) des Labyrinths
		xPos = posi[0];
		yPos = posi[1];
		ShowLabyrinth.showLabyrinth(aktLabyrinth);

		while (true) {
			KeyEvent event = buffer.pop();
			//der Buffer speichert das letzte Key-Event (also die letzte Tastatureingabe zwischen) und wird dann ausgelesen
			
			if(event != null)
			{
				if (event.getID() == java.awt.event.KeyEvent.KEY_PRESSED)
					//hier wird überprüft, ob eine Taste gedrückt wurde
				{
					switch (event.getKeyCode()) {
					case java.awt.event.KeyEvent.VK_UP:
						int yPosU = yPos--;
						if(yPos >= 0 && aktLabyrinth.zulaessig(xPos,yPosU) == true)
						{
							yPos--;
							System.out.println(yPos);
						}
						break;
						
					case java.awt.event.KeyEvent.VK_DOWN:
						int yPosD = yPos++;
						if (yPos <= 19 && aktLabyrinth.zulaessig(xPos, yPosD)==true)
						{
							yPos++;
							System.out.println(yPos);
						}
						break;
						
					case java.awt.event.KeyEvent.VK_LEFT:
						int xPosL = xPos--;
						if(xPos >= 0 && aktLabyrinth.zulaessig(xPosL, yPos)== true)
						{
							xPos--;
							System.out.println(xPos);
						}
						break;
						
					case java.awt.event.KeyEvent.VK_RIGHT:
						int xPosR = xPos++;
						if(xPos <= 19 && aktLabyrinth.zulaessig(xPosR, yPos)== true)
						{
							xPos++;
							System.out.println(xPos);
						}
						break;
					default:
						
					}
				}
			}
			//controller.resetColors();
			//controller.setColor(xPos, yPos, 127,0,0);
			//controller.updateBoard();
			ShowLabyrinth.updatePosition(posi, aktLabyrinth);
		}
		
	}

}
