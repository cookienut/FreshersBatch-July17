public class Stack{
	
	private int top;
	private int arr[]=new int[5]; 
	
	public Stack(){
		top=-1;
	}
	
	public void push(int newElement){
		
		if(top<4){
			top++;
			arr[top]=newElement;
		}
		else
			System.out.println("\nStack is full!!");
	}
	
	public int pop(){

		int poppedElement=arr[top];
		if(top>-1){
			top--;
			return poppedElement;
			}
		else
			return(-1);
	}
	
	public void displayStack(){
		
		int i;
		for(i=0;i<=this.top;i++){
			System.out.println("\n--\n"+arr[i]+"\n--");
		}
	}
	
	public static void main(String args[]){
		
		Stack s = new Stack();
		int element;
		s.push(11);
		s.push(12);
		s.push(14);
		s.displayStack();
		s.push(15);
		s.push(16);
		s.push(20);
		s.displayStack();
		
		element=s.pop();
		System.out.println("\nPopped Element:"+element);
		
		element=s.pop();
		System.out.println("\nPopped Element:"+element);
		
		element=s.pop();
		System.out.println("\nPopped Element:"+element);
		
		s.displayStack();
		
		System.out.println("\n\nPushed another element:20");
		s.push(20);
		s.displayStack();		
	}
}	