import java.util.Scanner;
import java.util.ArrayList;

abstract class DessertItem{
	
	abstract double getCost();
	abstract double getTax();
	abstract double getPrice();
	
}
 
class Candy extends DessertItem{
	
	private int quantity;
	private int price;
	
	public Candy(){	
		
	}
	
	public double getTax(){
		
		double tax=10;
		return(tax);
	}
	public double getPrice(){
		double price=20;
		return(price);
	}
	public double getCost(){
		
		double cost;
		cost=(this.getPrice()*this.getCost()*this.quantity);
		return(cost);
	}
	
} 

 
public class Dessert{
	
	private static ArrayList<Candy> candyList = new ArrayList<Candy>();
/*	private static ArrayList<Cookies> cookieList = new ArrayList<Cookies>();
	private static ArrayList<IceCream> iceCreamList = new ArrayList<IceCream>();*/

	private Dessert(){}

	public static void main(String args[]){
		
		int i,ch;
		int chOwner;
		int chCust;
		int addItems;
		Scanner sc = new Scanner(System.in);	
		String profile;
		System.out.println("\n1.ShopOwner \n2.Customer\n\nChoose your Profile: ");
		ch=sc.nextInt();
		
		outer: 
		switch(ch){
			
			case 1: System.out.println("Welcome Owner!");
					System.out.println("Options: \n1.Add Candies\n2.Add Cookies\n3.Add IceCreams\n4.Exit\n\nEnter choice:");
					chOwner=sc.nextInt();
					switch(chOwner){
						case 1:	
								System.out.println("\nNo of Candies in Inventory: "+candyList.size());
								System.out.println("\nEnter the no. of candies you would like to insert:");
								addItems=sc.nextInt();
								for(i=0;i<addItems;i++){
									Candy cand = new Candy();
									candyList.add(cand);
								}
								System.out.println(addItems+" candies added Successfully!");
								break;
						/*case 2:break;
						case 3:break;*/
						case 4:break outer;
					}
					break;
			case 2: System.out.println("Customer");break;
		}
	}
}
