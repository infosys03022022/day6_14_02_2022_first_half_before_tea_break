package infosys.demo.arrays;

import java.util.Scanner;

public class EmployeeDetailsMain {

	public static void main(String[] args) {
	// The following line means we created an array of EmployeeDetails type 
	// and the size is 2
		EmployeeDetails employees[]=new EmployeeDetails[2];
		Scanner scan=new Scanner(System.in);
		
		// The default value for Reference type is null and that is the reason the loop
		// is displaying null
        /* for(EmployeeDetails employee : employees)
        {
          System.out.println(employee);  	
        } */
       // So the next step after creating the array of references , each reference element 
	// should be intialised with the newly created object
		 //   0    1
		 // |null|null|
		 
		for(int i=0;i<employees.length;i++)
		 {
			 employees[i]=new EmployeeDetails();
			 System.out.println("Ente the details for the employee");
			 System.out.println("Enter the id");
			 employees[i].setId(scan.nextInt());
			 System.out.println("Enter the name");
			 employees[i].setName(scan.next());
			 String addresses[]=new String[2];
			 for(int j=0;j<addresses.length;j++)
			 {
				 System.out.println("Enter the address");
				 addresses[j]=scan.next();
			 }
			 employees[i].setAddress(addresses);
		 }
        
		for(EmployeeDetails employee : employees)
		{
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			String addresses[]=employee.getAddress();
			for(String address : addresses)
			{
				System.out.println(address);
			}
			
		}
        
        
	}

}
