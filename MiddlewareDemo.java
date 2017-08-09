package middleware;

import java.lang.reflect.*;

class Employee{
	
	public int getEmpSalary(int EmpCode){
		
		return 100000;
	}
	
}


class Middleware{
	
	public static Object invokeMethod(String className,String methodName,Class paramInt[],Object params[]){
		
		//Class.getDeclaredConstructor(String.class).newInstance("HERESMYARG");
		try{
			Class c = Class.forName(className);
			Object obj = c.newInstance();
			Method m = c.getDeclaredMethod(methodName,paramInt);
			return m.invoke(obj,params);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}

public class MiddlewareDemo{
	
	public static void main(String args[]) throws Exception{
		
		int sal;
		
		String className="Employee";
		String methodName="getEmpSalary";
		
		Class paramInt[]=new Class[1];
		paramInt[0]=int.class;				//INTEGER.TYPE
			
		Object params[]=new Object[1];
		params[0]=10;
		
		sal=(int)Middleware.invokeMethod(className,methodName,paramInt,params);
		
		System.out.println("Salary of Employee: "+sal);
		
	}
}