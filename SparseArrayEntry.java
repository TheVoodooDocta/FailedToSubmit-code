
public class SparseArrayEntry {
	
		//The row index and column index for this entry in the sparse array
		private int row;
		private int col;
		private int value; //The value of this entry in the sparse array
		//Constructs a SparseArrayEntry object that represents a sparse array element
		//with row index r and column index c, containing value c
		public SparseArrayEntry(int r, int c, int v)
		{
			row = r;
			col = c;
			value = v;
		}
		//Returns the row index of this sparse array element
		public int getRow(){
			return row;
		}
		//Returns the column index of this sparse array element
		public int getCol(){
			return col;
		}
		//Returns the value of this sparse array element
		public int getValue(){
			return value;
		}
	}//End of SparseArrayEntry
