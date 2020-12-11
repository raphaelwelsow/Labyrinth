public class labyrintheElement {
	private int labyrinthe[][];
	private String name;
	private int level;
	private labyrintheElement next;
	
	public labyrintheElement(int labyrinthe[][],int level, String name) {
		this.labyrinthe = labyrinthe;
		this.level=level;
		this.name=name;
		
	}
	
	public int getPositionValue(int x,int y) {
		if(this.labyrinthe[y][x] >3 || this.labyrinthe[y][x] <0) {
			System.out.println("Fehler!: Die Position: (" +x+ "/" +y +") hat einen Wert, der größer 3 oder kleiner null ist! ");
			return 0;
		}
		else {
		return this.labyrinthe[y][x];
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
	

	public int[][] getLabyrinthe() {
		return labyrinthe;
	}

	public void setLabyrinthe(int[][] labyrinthe) {
		this.labyrinthe = labyrinthe;
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

	public labyrintheElement getNext() {
		return next;
	}

	public void setNext(labyrintheElement next) {
		this.next = next;
	}
	
	
}
