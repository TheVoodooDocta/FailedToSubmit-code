public class GBRunner {
	public static void main(String[] args) {
		Piece [][] grid = new Piece[4][4];
		place(grid,new Player("Tim") );
		place(grid,new Bomb());
		place(grid,new Bomb());
		for(int j=0;j<=12;j++)
			place(grid,new Gold());

		for(int r=0;r<grid.length;r++){
			for(int c=0;c<grid[r].length;c++){
				System.out.print(grid[r][c] + "\t");
			}
			System.out.println();
		}
		Player p = findPlayer( grid );
		int num = getGold( grid, p );
		System.out.println("The player is next to " + num + " bars of gold." );
		Bomb[] bombs = findBombs( grid, 2 );
		int nextToBombs = 0;
		int nextToDeadly = 0;
		for(int i=0;i<bombs.length;i++){
			if(bombs[i].nextTo(p)){
				if(bombs[i].isDeadly()){
					nextToDeadly++;
				}
				nextToBombs++;
			}
		}
		System.out.println("The player is next to " + nextToBombs + " bomb(s)." );
		if ( nextToBombs>0 )
			System.out.println( nextToDeadly + " of them is/are deadly.\n" );
	} //End of main
	public static void place( Piece [][] arr, Piece p ){
		int row=(int)(4*Math.random()),col=(int)(4*Math.random());
		while(!(arr[row][col]==(null))){
			row=(int)(4*Math.random());
			col=(int)(4*Math.random());
		}
		p.setLocation(row, col);
		arr[row][col]=p;
	}

	public static Player findPlayer( Piece [][] arr ){
		for(int r=0;r<arr.length;r++)
			for(int c=0;c<arr[r].length;c++)
				if(arr[r][c] instanceof Player)
					return (Player)arr[r][c];
		return null;
		// searches the array for the first piece = instance of player
		// return that value
		// return null if a Player is not found
	}
	public static int getGold( Piece [][] arr, Player p ){
		int gold=0;
		for(int r=0;r<arr.length;r++)
			for(int c=0;c<arr[r].length;c++)
				if(p.nextTo(arr[r][c])&&arr[r][c] instanceof Gold)
					gold+=((Gold)arr[r][c]).getBars();
		return gold;
		// Given a player, return the number of adjacent bars of gold.
	}
	public static Bomb[] findBombs( Piece [][] arr, int num ){
		int i=0;
		Bomb[] b= new Bomb[2];
		for(int r=0;r<arr.length;r++)
			for(int c=0;c<arr[r].length;c++)
				if(arr[r][c] instanceof Bomb){
					b[i]=(Bomb)arr[r][c];
					i++;
				}
		return b;
	// Returns an array of Bombs that are in arr, num is the number of bombs
	}
} //End of GB Runner