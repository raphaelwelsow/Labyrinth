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
	
}
//Es fehlt noch eine getLab methode oder irgendwas in der Art, das den Zugriff in Umbenennen main ermöglicht
// also .getObject oder so
