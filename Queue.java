public class Queue{
	
	private int front;
	private int rear;
	private int arr[]=new int[8]; 
	public static int MAXLENGTH=8;
	
	public Queue(){
		front=0;
		rear=0;
	}
	
	public void enqueue(int newElement){
		
		if(rear<MAXLENGTH){
			arr[rear]=newElement;
			rear++;
		}	
		else{
			System.out.println("The Queue is Full !");
		}
			
	}
	
	
	
	public void displayQueue(){
		
		int i;
		for(i=0;i<=this.top;i++){
			System.out.println("\n--\n"+arr[i]+"\n--");
		}
	}
	
	public static void main(String args[]){
		
		Queue q= new Queue();
		int element;
		q.enqueue(10);
		q.enqueue(13);
		q.enqueue(14);
		q.displayQueue();

		element=q.dequeue();
		System.out.println("\nDequed Element:"+element);
		
	}
}	