import java.awt.event.KeyEvent;
import ledControl.BoardController;
import ledControl.LedConfiguration;
import ledControl.gui.KeyBuffer;
import java.awt.event.KeyEvent;

public class UmbenennenMain {

	private static BoardController controller;
	private static KeyBuffer buffer;
	private static int xPos, yPos;
	public static int[] posi = new int[2];

	public static void main(String[] args) {
		// größeres Board falls gewünscht
		BoardController.getBoardController(LedConfiguration.LED_20x20_EMULATOR);
		BoardController controller = BoardController.getBoardController();

		Sammlung.SammlungErstellen();
		controller = BoardController.getBoardController();
		buffer = controller.getKeyBuffer();

		Text.showTeam();
		Text.erklärung();

		// Startposition des Punktes festlegen
		LabyrinthElement aktLabyrinth = Sammlung.main.getLabyrinth(0);
		System.out.print(aktLabyrinth.getEnd()[0] + aktLabyrinth.getEnd()[1]);
		posi = aktLabyrinth.getStart();// übergibt den Startwert (x) des Labyrinths
		xPos = posi[0];
		yPos = posi[1];
		System.out.println(xPos);
		System.out.println(yPos);
		ShowLabyrinth.showLabyrinth(aktLabyrinth);

		while (true) {
			KeyEvent event = buffer.pop();
			// der Buffer speichert das letzte Key-Event (also die letzte Tastatureingabe
			// zwischen) und wird dann ausgelesen

			if (event != null) {
				if (event.getID() == java.awt.event.KeyEvent.KEY_PRESSED)
				// hier wird überprüft, ob eine Taste gedrückt wurde
				{
					switch (event.getKeyCode()) {
					case java.awt.event.KeyEvent.VK_UP:
						int yPosU = yPos;
						if (yPos >= 0 && aktLabyrinth.zulaessig(xPos, --yPosU) == true) {
							yPos--;
						}
						break;

					case java.awt.event.KeyEvent.VK_DOWN:
						int yPosD = yPos;
						if (yPos <= 19 && aktLabyrinth.zulaessig(xPos, ++yPosD) == true) {
							yPos++;
						}
						break;

					case java.awt.event.KeyEvent.VK_LEFT:
						int xPosL = xPos;
						if (xPos >= 0 && aktLabyrinth.zulaessig(--xPosL, yPos) == true) {
							xPos--;
						}
						break;

					case java.awt.event.KeyEvent.VK_RIGHT:
						int xPosR = xPos;
						if (xPos <= 19 && aktLabyrinth.zulaessig(++xPosR, yPos) == true) {
							xPos++;
						}
						break;
					default:

					}
				}

			}

			ShowLabyrinth.updatePosition(new int[] { xPos, yPos }, aktLabyrinth);
			if (aktLabyrinth.getNext() != null && xPos == aktLabyrinth.getEnd()[0]  && yPos == aktLabyrinth.getEnd()[1]){
				Text.showEnd(aktLabyrinth.getNext().getLevel());
				aktLabyrinth = aktLabyrinth.getNext();
				System.out.print("Ziel erreicht!");
				posi = aktLabyrinth.getStart();// übergibt den Startwert (x) des Labyrinths
				xPos = posi[0];
				yPos = posi[1];
				//System.out.println(xPos);
				//System.out.println(yPos);
				ShowLabyrinth.showLabyrinth(aktLabyrinth);
			}
		}

	}
}
