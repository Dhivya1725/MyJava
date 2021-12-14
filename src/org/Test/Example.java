package org.Test;

public class Example {
	public static void main(String[] args) {
		int count=1;
		while(count<=15)
		{
			System.out.println((count%2==1)? "@@@@@":"!!!!!!");
			++count;
			}
		int x=3,y=5,z=10,c;
		
		c=++z+y-y+z+x++;
		System.out.println(c);
		System.out.println("Dev_Test at My Java");
		
	}
	

}
