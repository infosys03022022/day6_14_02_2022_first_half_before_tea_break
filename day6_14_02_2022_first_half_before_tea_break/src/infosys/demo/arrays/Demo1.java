package infosys.demo.arrays;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int num[]=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int x : num)
		{
			System.out.println(x);
		}
		for(int i=0;i<num.length;i++ )
		{
			System.out.println("Enter the number");
			num[i]=scan.nextInt();
		}
		for(int x : num)
		{
			System.out.println(x);
		}

	}

}
