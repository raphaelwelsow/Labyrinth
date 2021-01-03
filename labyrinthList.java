public class labyrinthList {
	labyrinthElement head;
	
	public void addLabyrinthe(labyrinthElement labyrinth) {
		if(this.head == null) {
			this.head = labyrinth;
		}
		else {
			labyrinthElement node = head;
			
			while(node.getNext()!= null) {
				node = node.getNext();
			}
			node.setNext(labyrinth);
		}
	}
	
	public int getSize() {
		if(this.head == null) {
			return 0;
			
		}else {
			labyrinthElement node = head;
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
	
}
//Es fehlt noch eine getLab methode oder irgendwas in der Art, das den Zugriff in Umbenennen main ermöglicht
// also .getObject oder so
