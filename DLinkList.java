class Node{
	
	protected Node prev;
	protected int data;
	protected Node next;
	
	public Node(){
		this.prev=null;
		this.next=null;
		this.data=0;
	}
	public Node(Node pr,int d, Node nx){
		this.prev=pr;
		this.next=nx;
		this.data=d;
	}

	public void setPrev(Node p){
		this.prev=p;
	}
	
	public Node getPrev(){
		return(this.prev);
	}
	
	public void setNext(Node n){
		this.next=n;
	}
	
	public Node getNext(){
		return(this.next);
	}
	
	public void setData(int d){
		this.data=d;
	}
	
	public int getData(){
		return(this.data);
	}
}

class List{
	
	protected Node start;
	protected Node end;
	public int size;
	
	public List(){
		start=null;
		end=null;
		size=0;
	}
	
	
	
	public int countNode(){
		return this.size;
	}
	
	
	
	public boolean isEmpty(){
		if(start==null)
			return true;
		else
			return false;
	}
	
	
	
	public void insertAtPos(int pos,int val)
    {
		
        Node nptr = new Node(null,val,null);  
		int i=1;
		 
		
        if(pos == 1)
        {
			nptr.setNext(start);
			start.setPrev(nptr);
			start=nptr;
			this.size++;
			return;
        }
        else
        {
		
			Node ptr = start;
			for(i=2;i<=this.size;i++){
				Node newptr=ptr.getNext();
				if(i==pos){
					
					nptr.setNext(newptr);
					nptr.setPrev(ptr);
					ptr.setNext(nptr);
					newptr.setPrev(nptr);
					this.size++;
					return;
				}
				ptr=newptr;	
				
			}	
			
        }
    }
	
	
	public void deleteFromPos(int pos)
    {
		
		int i=1;
		 
		if(pos == this.countNode())
        {
			Node ptr = end.getPrev();
			end.setPrev(null);
			ptr.setNext(null);
			end=ptr;
			
			this.size--;
			return;
        }

		if(pos == 1)
        {
			Node ptr = start.getNext();
			ptr.setPrev(null);
			start.setNext(null);
			start=ptr;
			
			this.size--;
			return;
        }
        else
        {
		
			Node ptr = start;
			for(i=2;i<=this.size;i++){
				Node newptr=ptr.getNext();
				if(i==pos){
					
					ptr.setNext(newptr.getNext());
					(newptr.getNext()).setPrev(ptr);
					newptr.setNext(null);
					newptr.setPrev(null);
					
					this.size--;
					return;
				}
				ptr=newptr;	
				
			}	
			
        }
    }
	
	public void insert(int val)
    {
        Node nptr = new Node(null,val,null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.setPrev(end);
            end.setNext(nptr);
            end = nptr;
        }
        this.size++;
    }
	
	
	public void displayForward()
    {
        System.out.print("\nForward Doubly Linked List: ");
		if (size == 0) 
        {
            System.out.print("Empty\n");
            return;
        }
		
        if (start.getNext() == null) 
        {
            System.out.println(start.getData());
            return;
        }
		
        Node ptr = start;
        System.out.print(start.getData()+ " -- ");
        ptr = start.getNext();
        while (ptr.getNext() != null)
        {
            System.out.print(ptr.getData()+ " -- ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }
	
	public void displayBackward()
    {
        System.out.print("\nBackward Doubly Linked List: ");
		if (size == 0) 
        {
            System.out.print("Empty\n");
            return;
        }
		
        if (end.getPrev() == null) 
        {
            System.out.println(end.getData());
            return;
        }
		
        Node ptr = end;
        System.out.print(end.getData()+ " -- ");
        ptr = end.getPrev();
        while (ptr.getPrev() != null)
        {
            System.out.print(ptr.getData()+ " -- ");
            ptr = ptr.getPrev();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}


public class DLinkList{
	public static void main(String args[])
		{
			List dll = new List();
			
			int lastNodeNo;
			
			dll.insert(10);
			dll.insert(30);
			dll.insert(40);
			dll.insert(50);
			dll.insert(60);
			
			
			dll.displayForward();
			dll.displayBackward();

			System.out.print("\nInserting 20 at position 2:");
			dll.insertAtPos(2,20);	
			dll.displayForward();
			
			System.out.print("\nDeleting from last position :");
			lastNodeNo=dll.countNode();
			
			dll.deleteFromPos(lastNodeNo);	
			dll.displayForward();
			
			System.out.print("\nDeleting from position 2:");
			dll.deleteFromPos(2);	
			dll.displayForward();
			
			System.out.println("\nNumber of Nodes: "+dll.countNode());
		}
}	