public class Gold extends Piece {
	private int bars;
	public Gold(){//sets the number of bars to a random number between 1 and 10
		bars=(int)(10*Math.random()+1);
	}
	public int getBars(){//returns the number of bars
		return bars;
	}
	public String toString(){//overrides toString
		return "" +bars;
	}
}
