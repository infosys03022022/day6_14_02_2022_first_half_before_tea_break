package infosys.demo.arrays;

public class Demo2 {

	public static void main(String[] args) {
		String names[]= {"Ron","John","Jimmy"};
		// The above line is for string array
		// declaration and initialisation
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
			
		}
		System.out.println("--------------");
		for(String str : names)
		{
			System.out.println(str);
		}

	}

}
