public class Banner{
	
	public static void main(String args[]) throws InterruptedException{
		
		StringBuilder str1 = new StringBuilder(" Welcome to Java");
		char temp;
		
		while(true){
			
			try {
					temp=str1.charAt(0);
					str1=str1.delete(0,1);	
					str1.append(temp); 
					System.out.print(str1+"\r");
					Thread.sleep(500);
				}
				catch (InterruptedException e){
					
					e.printStackTrace();
				}
				
		}
		
	}
}