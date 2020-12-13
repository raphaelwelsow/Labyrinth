import ledControl.BoardController;
import ledControl.LedConfiguration;

public class text {
	
	private static int[] color0 = {0,0,0}; // gibt die Farbe f�r 0,1,2,3 an
	private static int[] color1 = {127,127,127};
	private static int[] color2 = {0,127,127};
	private static int[] color3 = {127,0,127};
	
	
	private static void updateAnzeige(int anzeige[][]) { // bekommt ein int text als Matrix �bergeben und gibt dieses aus
		BoardController.getBoardController(LedConfiguration.LED_20x20_EMULATOR);
		BoardController controller = BoardController.getBoardController();


		// Das Objekt in der anderen Klasse wird erstellt
		for (int z = 0; z <= 19; z++) {
			for (int i = 0; i <= 19; i++) {
				int value = anzeige[z][i];
				
				if(value == 0) {
					controller.setColor(i, z, color0[0], color0[1],color0[2]);
				}
				if(value ==1) {
					controller.setColor(i, z, color1[0], color1[1],color1[2]);
				}
				if(value ==2) {
					controller.setColor(i, z, color2[0], color2[1],color2[2]);
				}if(value ==3) {
					controller.setColor(i, z, color3[0], color3[1],color3[2]);
				}
			}
			controller.updateBoard();
		}
	}
	
	
	
	public static void showTeam() { // gibt auf dem board den Teamnamen aus
		BoardController.getBoardController(LedConfiguration.LED_20x20_EMULATOR);
		BoardController controller = BoardController.getBoardController();
		
		
		updateAnzeige(teamText);
		controller.sleep(1500);
		updateAnzeige(umbenennenText);
		controller.sleep(1500);
		}
	
	public static void erkl�rung() { // gibt auf dem Board die Spielerkl�rung aus
		BoardController.getBoardController(LedConfiguration.LED_20x20_EMULATOR);
		BoardController controller = BoardController.getBoardController();
		
		
		updateAnzeige(findeDenWegText);
		controller.sleep(1500);
		updateAnzeige(inDieText);
		controller.sleep(1500);
		updateAnzeige(programmierText);
		controller.sleep(1500);
		updateAnzeige(beratungText);
		controller.sleep(1500);
		}
		
		
	private static int[][] findeDenWegText =  	{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
												 {0,1,1,1,0,1,0,0,1,0,1,1,0,0,1,1,1,0,0,0},
												 {0,1,0,0,0,1,1,0,1,0,1,0,1,0,1,0,0,0,0,0},
												 {0,1,1,0,0,1,0,1,1,0,1,0,1,0,1,1,0,0,0,0},
												 {0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0},
												 {0,1,0,0,0,1,0,0,1,0,1,1,1,0,1,1,1,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},						 
												 {0,0,0,0,3,3,0,0,3,3,3,0,3,0,0,3,0,0,0,0},
												 {0,0,0,0,3,0,3,0,3,0,0,0,3,3,0,3,0,0,0,0},
												 {0,0,0,0,3,0,3,0,3,3,0,0,3,0,3,3,0,0,0,0},
												 {0,0,0,0,3,0,3,0,3,0,0,0,3,0,0,3,0,0,0,0},
												 {0,0,0,0,3,3,3,0,3,3,3,0,3,0,0,3,0,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
												 {0,2,0,0,0,2,0,2,2,2,2,2,0,2,2,2,2,2,0,0},
												 {0,2,0,0,0,2,0,2,0,0,0,0,0,2,0,0,0,0,0,0},
												 {0,2,0,0,0,2,0,2,2,2,2,0,0,2,0,2,2,0,0,0},
												 {0,2,0,2,0,2,0,2,0,0,0,0,0,2,0,0,0,2,0,0},
												 {0,2,2,0,2,2,0,2,2,2,2,2,0,2,2,2,2,2,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
	
	
	private static int[][] inDieText =  	{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,0,0,0},						 
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,2,2,0,0,2,0,2,2,2,0,0,0,0,0,0,0},
											 {0,0,0,0,2,0,2,0,2,0,2,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,2,0,2,0,2,0,2,2,0,0,0,0,0,0,0,0},
											 {0,0,0,0,2,0,2,0,2,0,2,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,2,2,2,0,2,0,2,2,2,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
					
	
	private static int[][] programmierText =  	{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
												 {0,1,1,0,0,1,1,0,0,0,1,1,0,0,1,1,0,0,0,0},
												 {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0,0},
												 {0,1,1,0,0,1,1,0,0,1,0,1,0,1,0,1,0,2,2,0},
												 {0,1,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,0},
												 {0,1,0,0,0,1,0,1,0,1,1,1,0,1,1,1,0,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},						 
												 {0,1,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0},
												 {0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,0,0,0,0,0},
												 {0,1,1,0,0,1,1,1,0,1,1,0,1,0,2,2,0,0,0,0},
												 {0,1,0,1,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0,0},
												 {0,1,0,1,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
												 {0,1,0,0,1,0,1,0,1,1,1,0,1,1,0,0,0,0,0,0},
												 {0,1,0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0},
												 {0,1,1,0,1,0,1,0,1,1,0,0,1,1,0,0,2,2,0,0},
												 {0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,0,0},
												 {0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
	
	private static int[][] beratungText =  	{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,0,0,0,0,0},
											 {0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0},
											 {0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,1,0,2,2,0},						 
											 {0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0},
											 {0,1,1,0,0,1,1,1,0,1,0,1,0,1,0,1,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,1,1,1,0,1,0,1,0,1,0,0,1,0,0,1,1,0,0,0},
											 {0,0,1,0,0,1,0,1,0,1,1,0,1,0,1,0,0,0,0,0},
											 {0,0,1,0,0,1,0,1,0,1,0,1,1,0,1,0,1,0,0,0},
											 {0,0,1,0,0,1,0,1,0,1,0,0,1,0,1,0,1,0,0,0},
											 {0,0,1,0,0,0,1,1,0,1,0,0,1,0,1,1,1,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		



	private static int[][] teamText =  	{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},						 
										 {0,0,1,1,1,0,1,1,1,0,0,1,0,0,1,0,0,1,0,0},
										 {0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,0,1,1,0,0},
										 {0,0,0,1,0,0,1,1,0,0,1,1,1,0,1,1,0,1,0,0},
										 {0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0},
										 {0,0,0,1,0,0,1,1,1,0,1,0,1,0,1,0,0,1,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
										 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

	private static int[][] umbenennenText =  	{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							 					 {0,1,0,1,0,1,0,0,1,0,1,1,0,0,1,1,1,0,0,0},
												 {0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0,0,0,0,0},
												 {0,1,0,1,0,1,1,0,1,0,1,1,0,0,1,1,0,2,2,0},
												 {0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0},
												 {0,0,1,1,0,1,0,0,1,0,1,1,0,0,1,1,1,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},						 
												 {0,0,0,1,0,0,1,0,1,1,1,0,1,0,0,1,0,0,0,0},
												 {0,0,0,1,1,0,1,0,1,0,0,0,1,1,0,1,0,0,0,0},
												 {0,0,0,1,0,1,1,0,1,1,0,0,1,0,1,1,0,2,2,0},
												 {0,0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,0},
												 {0,0,0,1,0,0,1,0,1,1,1,0,1,0,0,1,0,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
												 {0,0,0,1,0,0,1,0,1,1,1,0,1,0,0,1,0,0,0,0},
												 {0,0,0,1,1,0,1,0,1,0,0,0,1,1,0,1,0,0,0,0},
												 {0,0,0,1,0,1,1,0,1,1,0,0,1,0,1,1,0,0,0,0},
												 {0,0,0,1,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,0},
												 {0,0,0,1,0,0,1,0,1,1,1,0,1,0,0,1,0,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
												 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

	private static int[][] emptyText =  	{{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},						 
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
											 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

									}