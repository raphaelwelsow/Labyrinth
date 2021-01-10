public class LabyrinthList {
	LabyrinthElement head;
	
	public void addLabyrinthe(LabyrinthElement labyrinth) {
		if(this.head == null) {
			this.head = labyrinth;
		}
		else {
			LabyrinthElement node = head;
			
			while(node.getNext()!= null) {
				node = node.getNext();
			}
			node.setNext(labyrinth);
		}
		System.out.println("Element " + labyrinth.getName() + "Wurde der Liste hinzugefügt!");
	}
	
	public int getSize() {
		if(this.head == null) {
			return 0;
			
		}else {
			LabyrinthElement node = head;
			 int counter= 0;
			 
			while(node != null) {
				counter ++;
				node=node.getNext();
			}
			return counter;
				
		}
	}
	
	
		public LabyrinthElement getLabyrinth(int position) {
		if(head == null) {
			System.out.println("Fehler Kein Labyrinth vorhanden!");
			return null;
		}
		LabyrinthElement node = head;
		
		for(int i=0; i<position;i++) {
			if(node ==null) {
				System.out.println("Kein Labyrinth an dieser Stelle vorhanden");
				return null;
			}
			node = node.getNext();
		}
		return node;
			
		}
		
	}
	
