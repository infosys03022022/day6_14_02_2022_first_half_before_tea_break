package infosys.demo.arrays;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		String names[]= new String[5];
		// The above line is for string array
		// declaration and initialisation
		Scanner s=new Scanner(System.in);
		for(int i=0;i<names.length;i++)
		{
			
			System.out.println("Enter name");
	        names[i]=s.next();		
			
		}
		System.out.println("The names are");
		for(String str : names)
		{
			System.out.println(str);
		}

	}

}
