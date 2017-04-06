import java.util.Scanner;
public class SalesClerksDriver {

	public static void main(String[] args) {
		Scanner kbInput = new Scanner (System.in);
		SalesClerks salesList= new SalesClerks(5);
		String name;
		double sale;
		System.out.print("Enter clerk's name (q to quit):");
		name = kbInput.nextLine();
		while (!name.equals("q"))
		{
			System.out.print("Enter sale amount: ");
			sale = kbInput.nextDouble();
			kbInput.nextLine();
			salesList.addSale(name, sale);
			System.out.print("Enter clerk's name (q to quit):");
			name = kbInput.nextLine();
		}
		salesList.printSales();
		kbInput.close();
	}

}


