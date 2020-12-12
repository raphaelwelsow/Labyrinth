import java.awt.event.KeyEvent;
import ledControl.BoardController;
import ledControl.LedConfiguration;
import ledControl.gui.KeyBuffer;




public class ShowLabyrinth {
	static int colorBorder[] = {0,0,127};
	static int colorWay[] = {127,127,127};
	static int colorStart[] = {0,127,0};
	static int colorEnd[] = {127,0,0};
	static int colorPosition[] = {127,0,127};

	
	public static void showLabyrinth(labyrinthElement labyrinth) {
		BoardController.getBoardController(LedConfiguration.LED_20x20_EMULATOR);
		BoardController controller = BoardController.getBoardController();
		

		// Das Objekt in der anderen Klasse wird erstellt

		for (int z = 0; z <= 19; z++) {

			for (int i = 0; i <= 19; i++) {
				int value = labyrinth.getPositionValue(i, z);
				
				if(value == 0) {
					controller.setColor(i, z, colorBorder[0], colorBorder[1],colorBorder[2]);
				}
				if(value ==1) {
					controller.setColor(i, z, colorWay[0], colorWay[1],colorWay[2]);
				}
				if(value ==2) {
					controller.setColor(i, z, colorStart[0], colorStart[1],colorStart[2]);
				}if(value ==3) {
					controller.setColor(i, z, colorEnd[0], colorEnd[1],colorEnd[2]);
				}
				
				

			}
			controller.updateBoard();
		}
	}
	
	
	public static void updatePosition(int[] old, int[] current, labyrinthElement labyrinth) {	
		updateOldPosition(old,labyrinth);
		updateCurrentPosition(current);
		
	}
	
	
	
	
	
	 private static void updateOldPosition(int[] old, labyrinthElement labyrinth) {
		BoardController.getBoardController(LedConfiguration.LED_20x20_EMULATOR);
		BoardController controller = BoardController.getBoardController();
		
		
		int x = old[0];
		int y = old[1];
		
		int value = labyrinth.getPositionValue(x, y);
		
		if(value == 0) {
			controller.setColor(x, y, colorBorder[0], colorBorder[1],colorBorder[2]);
		}
		if(value ==1) {
			controller.setColor(x, y, colorWay[0], colorWay[1],colorWay[2]);
		}
		if(value ==2) {
			controller.setColor(x, y, colorStart[0], colorStart[1],colorStart[2]);
		}if(value ==3) {
			controller.setColor(x, y, colorEnd[0], colorEnd[1],colorEnd[2]);
		}
		controller.updateBoard();
		
		
	}
	 
	 private static void updateCurrentPosition(int[]current){
		 BoardController.getBoardController(LedConfiguration.LED_20x20_EMULATOR);
		BoardController controller = BoardController.getBoardController();
		
		int x= current[0];
		int y= current[1];
			
		
		controller.setColor(x, y, colorPosition[0], colorPosition[1],colorPosition[2]);
		controller.updateBoard();
		
		 
		 
	 }
	 
	 
	

}