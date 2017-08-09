public class Date{
	
	private int day;
	private int month;
	private int year;
	
	public Date(){
		System.out.println("Default Constructor called!");
		this.day=7;
		this.month=8;
		this.year=2017;
	}
	
	public Date(int day,int month,int year){
		System.out.println("Parameterized Constructor called!");
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public void getDate(){
		System.out.println("The date is: "+this.day+"-"+this.month+"-"+this.year);
	}
	
	public void swapDate(Date d2){
		
		int temp;
		
		temp=this.day;
		this.day=d2.day;
		d2.day=temp;
		
		temp=this.month;
		this.month=d2.month;
		d2.month=temp;
		
		temp=this.year;
		this.year=d2.year;
		d2.year=temp;
	}
	
	
	public static void main(String args[]){
		
		Date d = new Date();
		Date d1 = new Date(18,7,1994);
		
		System.out.println("Before Swapping:");
		d.getDate();
		d1.getDate();
		
		d.swapDate(d1);
		
		System.out.println("After Swapping:");
		d.getDate();
		d1.getDate();
		
	}
	
}


