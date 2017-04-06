import java.util.*;
public class SparseArray {
	
		//The number of columns and rows of the sparse array
		private int numRows;
		private int numCols;
		
		// The list of entries representing non-zero elements of the sparse array.
		//Entries are stored in no particular oder. Each non-zero elements is
		//represented by exactly one entry in the list
		private List<SparseArrayEntry> entries;
		
		//Constructs a SparseArray object with number or rows nRows and number of
		//columns nCols. Creates an empty list of elements.
		public SparseArray(int nRows, int nCols){
			entries = new ArrayList<SparseArrayEntry>();
			numRows = nRows;
			numCols = nCols;
		}
		
		//Add SparseArrayEntry object of row index r, col index c and value v.
		public void addEntry(int r, int c, int v){
			entries.add(new SparseArrayEntry(r, c, v));
		}
		
		//Returns the number of rows in the sparse array
		public int getNumRows(){
			return numRows;
		}
		
		//Returns the number of columns in the sparse array.
		public int getNumCols(){
			return numCols;
		}
		
		//Displays each element of the sparse array on its own line in the following format
		// row:1 col:4 value:4
		// to be implemented in part (a)
		public void displayEntries(){
			for(int i=0;i<entries.size();i++){
				System.out.println("row:" + entries.get(i).getRow() + "\tcol:" + entries.get(i).getCol() + "\tvalue:" + 
						entries.get(i).getValue());
			}
		}
		//Returns the value of the element at row index row and column index col
		//in the sparse array. Assumes 0<= row <getNumRows() and 0<= col< getNumCols()
		// to be implemented in part (b)
		public int getValueAt(int row, int col){
			for(int i=0;i<entries.size();i++){
				SparseArrayEntry temp=entries.get(i);
				if(temp.getRow()==row&&temp.getCol()==col)
					return(temp.getValue());
			}
			return 0;
		}
		//Removes the column col from the sparse array.
		// Assumes 0<=col < getNumCols()
		// to be implemented in part (c)
		public void removeColumn(int col){
			for(int i=0;i<entries.size();i++){
				if(entries.get(i).getCol()==col){
					entries.remove(i);
					i--;
				}
				else if (entries.get(i).getCol()>col)
					entries.set(i, new SparseArrayEntry(entries.get(i).getRow(),entries.get(i).getCol()-1,entries.get(i).getValue()));
			}
			numCols--;
		}
	} //End of SparseArray class
