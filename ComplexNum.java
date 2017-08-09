public class ComplexNum{
	
	private int real;
	private int imaginary;
	
	public ComplexNum(){
		System.out.println("Default Constructor called!");
		this.real=1;
		this.imaginary=2;
	}
	
	public ComplexNum(int real,int imaginary){
		System.out.println("Parameterized Constructor called!");
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void getComplexNum(){
		System.out.println("Complex Number: " +this.real+" + "+this.imaginary+"i");
	}
	
	public ComplexNum addComplexNum(ComplexNum c2){
		
		ComplexNum ans=new ComplexNum();
		
		int realSum=0;
		int imaginarySum=0;
		
		realSum=this.real+c2.real;
		imaginarySum=this.imaginary+c2.imaginary;
		
		System.out.println("Addition: " +realSum+" + ("+imaginarySum+")i");
		
		ans.real=realSum;
		ans.imaginary=imaginarySum;
		
		return ans;
	}
	
	public void subtractComplexNum(ComplexNum c2){
		
		int realDiff=0;
		int imaginaryDiff=0;
		
		realDiff=this.real-c2.real;
		imaginaryDiff=this.imaginary-c2.imaginary;
		
		System.out.println("Subtraction: " +realDiff+" + ("+imaginaryDiff+")i");
	}
	
	public void multiplyComplexNum(ComplexNum c2){
		
		int realSum=0;
		int imaginarySum=0;
		
		realSum=(this.real*c2.real)-(this.imaginary*c2.imaginary);
		imaginarySum=(this.real*c2.imaginary)+(this.imaginary*c2.real);
		
		System.out.println("Multiplication: " +realSum+" + ("+imaginarySum+")i");
	}
	
	public void swapComplexNum(ComplexNum c2)
	{
		int temp;
		
		temp=this.real;
		this.real=c2.real;
		c2.real=temp;
		
		temp=this.imaginary;
		this.imaginary=c2.imaginary;
		c2.imaginary=temp;
		
	}
	
	public String toString(){
		return(real+" + "+"("+imaginary+")i");
	}
	
	public static void main(String args[]){
		
		ComplexNum c1 = new ComplexNum();
		ComplexNum c2 = new ComplexNum(2,3);
		ComplexNum c3 = new ComplexNum();
		
		System.out.println("Before Swapping");
		c1.getComplexNum();
		c2.getComplexNum();
		
		c1.swapComplexNum(c2);
		
		System.out.println("After Swapping");
		c1.getComplexNum();
		c2.getComplexNum();
		
		c3=c1.addComplexNum(c2);
		System.out.println(c3);
		
		c1.subtractComplexNum(c2);
		c1.multiplyComplexNum(c2);
		
		
	}
	
}


