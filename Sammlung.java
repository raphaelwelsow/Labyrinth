//Diese Klasse dient der Verwaltung von Objekten des Typs labyrinthElement in einer Listenstruktur
public class Sammlung {
	static int[][] labyrinth1 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
			{ 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 },
			{ 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1 },
			{ 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1 },
			{ 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 },
			{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1 },
			{ 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 3 } };

	static int[][] labyrinth3 = 
		   {{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 2, 0, 3, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 } };
	
		static int[][] labyrinth2 = 
		   {{0,0,1,1,1,0,1,0,0,0,1,0,0,1,1,0,0,1,1,1},
			{0,1,1,1,0,1,1,1,1,0,1,1,1,1,0,1,1,1,0,1},
			{1,1,0,1,0,1,0,1,1,0,0,0,1,0,0,1,0,0,0,0},
			{1,0,0,1,1,1,0,1,0,0,1,1,1,1,1,1,0,1,1,1},
			{1,1,0,1,0,0,0,1,0,0,1,0,0,1,0,0,1,1,0,1},		
			{0,3,0,1,0,0,1,1,1,1,1,1,0,1,1,1,0,1,0,1},
			{0,0,0,0,0,1,1,0,0,0,0,1,0,0,0,1,1,1,1,0},
			{0,1,0,0,1,0,0,0,1,1,0,0,0,1,1,0,0,1,0,0},
			{0,1,0,0,1,0,0,1,0,0,1,0,1,0,0,1,0,1,1,0},
			{0,1,1,1,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,1},		
			{0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,1,0,1,1,1},
			{1,1,0,0,1,0,0,1,1,1,1,0,0,1,1,0,1,1,0,0},
			{1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0},
			{1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0},
			{1,1,1,1,1,1,1,0,0,0,0,1,0,0,1,1,0,1,0,0},
			{0,0,1,0,0,0,1,0,1,1,1,1,1,0,1,0,0,1,0,0},
			{1,1,1,0,1,0,1,0,0,1,0,0,1,1,1,0,1,1,1,0},
			{1,0,0,0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,1},
			{1,0,1,1,1,0,1,0,0,1,0,1,0,1,1,1,0,1,1,1},
			{2,0,1,0,1,1,0,0,1,1,0,1,0,0,0,1,0,1,0,0} };
	

	static LabyrinthList main = new LabyrinthList();

	static LabyrinthElement lab2 = new LabyrinthElement(labyrinth2, 2, "Snoop Doggs Labyrinth");
	static LabyrinthElement lab1 = new LabyrinthElement(labyrinth1, 1, "labyrinth1");
	static LabyrinthElement lab3 = new LabyrinthElement(labyrinth3, 1, "labyrinth3");

	public Sammlung() {

	}

	public static void SammlungErstellen() {
		main.addLabyrinthe(lab1);
		main.addLabyrinthe(lab2);
		main.addLabyrinthe(lab3);
	}

}
