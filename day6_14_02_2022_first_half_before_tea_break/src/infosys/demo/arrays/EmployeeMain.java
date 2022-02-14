
  package infosys.demo.arrays;
 
  import java.util.Scanner;
  public class EmployeeMain {
    public static void main(String args[]) {
    Scanner scan=new Scanner(System.in);

    Employee emp=new Employee();  

    String address[]=new String[2];

    System.out.println("Enter the id");
    emp.setId(scan.nextInt());
    System.out.println("Enter the name");
    emp.setName(scan.next());
    // for address first we need to create an array of String to store address
    // pass that array in the setAddress method of Employee class
    for(int i=0;i<address.length;i++){
    System.out.println("Enter the address");
    address[i]=scan.next();
    }
    emp.setAddress(address);
    System.out.println("The details for the employee");
    System.out.println("ID "+emp.getId());
    System.out.println("NAME "+emp.getName());
    address=emp.getAddress();
    for(String addr : address){
    System.out.println(addr);
    } // for each closed
  }  // main closed
 } // class closed
