
public abstract class Piece {
	private int row, col;
	public Piece(){//sets row and col to unreachable numbers
		row=-1;
		col=-1;
	}
	public void setLocation(int row, int col){//sets location of the piece
		this.row=row;
		this.col=col;
	}
	public boolean nextTo(Piece other){//returns true if the pieces are next to each other returns false if they are not next to each other
		return (Math.abs(row-other.row)<=1&&Math.abs(col-other.col)<=1);
	}
}
