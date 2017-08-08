interface Sortable{
	
	public int compare();
	public int getComparableElement();
}

class Employee implements Sortable{
	
	private int empCode;
	
	public Employee(int empCode){
		this.empCode=empCode;
	}
	public void compare(){
		System.out.println("This is Emp Bubble Sort");
	}
	
	public int getComparableElement(){
		return(empCode);
	}
	
	
}

class Circle implements Sortable{
	
	private int radius;
	public Circle(int radius){
		this.radius=radius;
	}
	
	public void compare(){
		System.out.println("This is Circle Bubble Sort");
	}
	
	public int getComparableElement(){
		return(radius);
	}
}	

public class TestSortable{
	
	public static void sortAll(Sortable p[]){
		
		int i;
		int j;
		Sortable temp;
		
		for(i=0;i<p.length-1;i++){
			for(j=0;j<p.length-i-1;j++){
				
				if( p[j].getComparableElement()>p[j+1].getComparableElement()){
					temp=p[j];
					p[j]=p[j+1];
					p[j+1]=temp;
				}
			}	
		}
		
		for(i=0;i<p.length;i++){
			System.out.println(p[i].getComparableElement());
		}	
	}
	
	public static void main(String args[]){
		
		Sortable p[] = new Sortable[4];
		p[0] = new Employee(100);
		p[1] = new Employee(300);
		p[2] = new Employee(150);
		p[3] = new Employee(320);
		
		sortAll(p);
	}
	
}


