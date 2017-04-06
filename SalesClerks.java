
public class SalesClerks {

	private Clerk[] clerkList;
	private int filledEle;
	
	public SalesClerks(int length){
		clerkList=new Clerk[length];
		filledEle=0;
	}
	private int findClerk(String name){
		for(int i=0;i<filledEle;i++){
			if(name.equals(clerkList[i].getName()))
				return i;
		}
		return -1;
	}
	public void addSale(String name, double sales){
		if(findClerk(name)==-1){
			clerkList[filledEle]=new Clerk(name);
			clerkList[filledEle].adjustSales(sales);
			filledEle++;
	}
		else{
			clerkList[findClerk(name)].adjustSales(sales);
		}
	}
		public void printSales(){
			for(int i=0;i<filledEle;i++)
				System.out.println(clerkList[i].getName()+ ": " + clerkList[i].getSales());
		}
}
