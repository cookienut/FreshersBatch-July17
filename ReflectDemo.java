package reflectiondemo;

import java.lang.reflect.*;

public class ReflectDemo{
	
	public static void main(String args[]) throws Exception{
		
		int i;
		
		Class c = Class.forName(args[0]);
		
		Constructor con[]=c.getDeclaredConstructors();
		Field f[]=c.getDeclaredFields();
		Method m[]=c.getDeclaredMethods();
		
		for(i=0;i<con.length;i++){
			System.out.println(con[i]);
		}
		for(i=0;i<f.length;i++){
			System.out.println(f[i]);
		}
		for(i=0;i<m.length;i++){
			System.out.println(m[i]);
		}
		
	}
}