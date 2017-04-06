

public class Book implements Products {

	private String title;
	private double cost;
	private int pages; //# pages in book
	
	public Book( String t,double c, int p){//constructor
		title =t;
		cost=c;
		pages=p;
	}
	public boolean equals(Object other){ //overrides Object.toString()
		if(!(other instanceof Book))
			return false;
		else
			return title.equals(((Book)other).title);
	}
	public String toString(){ //overrides Object.toString()
		return "Title: \"" +title+",\" Cost: $" + cost + ", Pages: " + pages;
	}
	public double getPrice() {//returns the cost
		return cost;
	}


	public void setPrice(double x) {//sets the price
		cost=x;

	}
	public int getPages(){//returns the number of pages
		return pages;
	}

}
