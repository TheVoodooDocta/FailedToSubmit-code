
public class SparseRunner {

	public static void main(String[] args) {
				//Creates new SparseArray Object
				SparseArray sparse = new SparseArray(6,5);
				//**PART A** Adds entries to the SparseArray object from the example on page 1
				
				sparse.addEntry(1,4,4);
				sparse.addEntry(2,0,1);
				sparse.addEntry(3,1,-9);
				sparse.addEntry(1,1,5);
				
				//**PART A** Display the number of Row and Columns on the Sparse array object, on separate lines
				// with appropriate descriptors
				
				System.out.println("Rows: " +sparse.getNumRows());
				System.out.println("Columns: " +sparse.getNumCols());
				
				//**PART A**Prints out the entries of the Sparse Array Object.
				
				sparse.displayEntries();
				
				//**PART B**Display the values, on separate lines with descriptors, for (3,1) and (5,2)
				
				System.out.println("The value at (3,1) is: " +sparse.getValueAt(3,1));
				System.out.println("The value at (5,2) is: " +sparse.getValueAt(5,2));
				
				//**PART C**Remove column number one
				sparse.removeColumn(1);
				
				//**PART C**Display the number of Row and Columns on the Sparse array object, on separate lines
				// with appropriate descriptors and then display the entries of the Sparse Array Object
				System.out.println("Rows: " +sparse.getNumRows());
				System.out.println("Columns: " +sparse.getNumCols());
				sparse.displayEntries();

	}

}
