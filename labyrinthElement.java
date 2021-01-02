public class LabyrinthElement {
	private int labyrinth[][];
	private String name;
	private int level;
	private LabyrinthElement next;
	
	public LabyrinthElement(int labyrinth[][],int level, String name) {
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
	
	
	
	public void printLabyrinth() {
		System.out.println(this.name +":");
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
	
	
	public int[] getStart() {
		for(int y=0;y < 20;y++) {
			
			for(int x=0;x < 20;x++) {
				
				if(this.getPositionValue(x, y)==2) {
					
				int rueckgarbe[] = {x,y};
					return rueckgarbe;
				}
			}
		}
		return null;
	}
	
	public int[] getEnd() {
		for(int y=0;y < 20;y++) {
			
			for(int x=0;x < 20;x++) {
				
				if(this.getPositionValue(x, y)==3) {
					
				int rueckgarbe[] = {x,y};
					return rueckgarbe;
				}
			}
		}
		return null;
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

	public LabyrinthElement getNext() {
		return next;
	}

	public void setNext(LabyrinthElement next) {
		this.next = next;
	}
	
	
}
