public class TreasureHunt {
	int numberOfGuesses;
	private char[][]board; 

	public TreasureHunt(){
		board = new char[3][5]; 
		numberOfGuesses=0;
		board[(int)(Math.random()*3) ][(int)(Math.random()*5)] = ' ';
	}
	public boolean isGold(int row, int col){
		numberOfGuesses++;
		if(row >= 0 && row <= 2 && col >= 0 && col <= 4){
			if(board[row][col] == ' ')
				return true;
			else{
				board[row][col] = 'X';
				return false;}}
		else
			return false;
	}
	public int getNumGuesses(){
		return numberOfGuesses;
	}
	public void printBoard(){
		for(int i = 0; i < board.length; i++){
			for(int n = 0; n < board[0].length; n++){
				System.out.print("" +board[i][n]);
				if(n!= 4)
					System.out.print('|');
			}
			System.out.println();
			if(i!=2)
				System.out.println("---------");}
	}
}