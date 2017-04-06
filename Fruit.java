
public class Fruit implements Products {

	private double cost;//cost of the fruit
	private String name;//name of the fruit
	public Fruit( String n, double c){//constructor
		name=n;
		cost=c;
	}
	public double getPrice() {//returns the cost
		return cost;
	}
	public void setPrice(double x) {
		cost=x;
	}
	public boolean equals(Object other){//overrides Object.equals()
		if(!(other instanceof Fruit))
			return false;
		else
			return (cost==((Fruit)other).cost&&name.equals(((Fruit)other).name));
	}
	public String toString(){//overrides Object.toString()
		return "Name: " + name+ ", Cost: $" +cost;
	}
}
