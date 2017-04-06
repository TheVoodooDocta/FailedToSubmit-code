
public class Bomb extends Piece {
	private boolean deadly;
	public Bomb(){
		double temp=Math.random();
		if(temp<=.5)
			deadly=true;
		else
			deadly=false;
	}
	public boolean isDeadly(){
		return deadly;
	}
	public String toString(){
		if(deadly)
			return "B!!";
		return "B";
	}
}

