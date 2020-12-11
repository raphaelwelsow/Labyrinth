public class labyrintheList {
	labyrintheElement head;
	
	public void addLabyrinthe(labyrintheElement labyrinthe) {
		if(this.head == null) {
			this.head = labyrinthe;
		}
		else {
			labyrintheElement node = head;
			
			while(node.getNext()!= null) {
				node = node.getNext();
			}
			node.setNext(labyrinthe);
		}
	}
	
	public int getSize() {
		if(this.head == null) {
			return 0;
			
		}else {
			labyrintheElement node = head;
			 int counter= 0;
			 
			while(node != null) {
				counter ++;
				node=node.getNext();
			}
			return counter;
				
		}
	}
	
}
