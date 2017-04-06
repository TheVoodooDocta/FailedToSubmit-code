
public class Grocer {
	private Products [] inventory; // contains all the products
	public Grocer( int size ){	
		inventory = new Products[ size ];
	}
	public void add( Products p ){
		for( int i=0;i<inventory.length;i++){
			if(inventory[i]==null){
				inventory[i]=p;
				break;
			}
		}
		//adds p to the first empty placeholder
	}
	public void remove( Products p ){
		for( int i=0;i<inventory.length;i++)
			if(inventory[i]!=null&&inventory[i].equals(p))
				inventory[i]=null;
		//removes a match to p in the array
	}
	public void increasePrices( double p ){
		for(int i=0;i<inventory.length;i++)
			if(!(inventory[i]==null))
				inventory[i].setPrice((1+p)*inventory[i].getPrice());
		//Increase the price of all products by p percent. For example, if p is 0.2 then prices increase by 20%. Beware of elements that contain null values.
	}
	public int totalPages(){
		int pages=0;
		for(int i=0;i<inventory.length;i++){
			if(inventory[i] instanceof Book)
				pages+=((Book)inventory[i]).getPages();
		}
		return pages;
		//Returns the number of pages in all the books in the inventory.
	}
	public String toString() {
		String s="";
		for(int i=0;i<inventory.length;i++)
			if(inventory[i]!=null)
				s=s + inventory[i].toString()+"\n";
		return s;
		//Return a string that contains the result of calling each non-null element�s toString method. Put a new line character between elements.
	}
}
