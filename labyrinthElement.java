public class labyrinthElement {
	private int labyrinth[][];
	private String name;
	private int level;
	private labyrinthElement next;
	
	public labyrinthElement(int labyrinth[][],int level, String name) {
		this.labyrinth = labyrinth;
		this.level=level;
		this.name=name;
		
	}
	
	public int getPositionValue(int x,int y) {
		if(this.labyrinth[y][x] >3 || this.labyrinth[y][x] <0) {
			System.out.println("Fehler!: Die Position: (" +x+ "/" +y +") hat einen Wert, der größer 3 oder kleiner null ist! ");
			return 0;
		}
		else {
		return this.labyrinth[y][x];
		}
	}
	
	public boolean zulaessig (int x, int y)
	{
		if (this.getPositionValue(x, y) != 0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printLabyrinth() {
		for(int z=0;z<=19;z++) {
		
		for(int i=0;i<=19;i++) {
			int value = this.getPositionValue(i, z);
			if(value==0) {
				System.out.print(" *");
			}
			if(value==1) {
				System.out.print(" O");
			}
			if(value==2) {
				System.out.print(" S");
			}
			if(value==3) {
				System.out.print(" E");
			}
		}
		System.out.println("");
	}
	}
	

	public int[][] getLabyrinth() {
		return labyrinth;
	}

	public void setLabyrinthe(int[][] labyrinth) {
		this.labyrinth = labyrinth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public labyrinthElement getNext() {
		return next;
	}

	public void setNext(labyrinthElement next) {
		this.next = next;
	}
	
	
}
