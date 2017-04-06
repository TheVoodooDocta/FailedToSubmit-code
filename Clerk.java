
public class Clerk {

		private String name;
		private double sales;
		
		public Clerk(String n){
			name = n;
			sales=0;
		}
		public String getName(){
			return name;
		}
		public double getSales(){
			return sales;
		}
		public void adjustSales(double amount){
			sales += amount;
		}
}
