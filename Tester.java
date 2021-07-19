package tester;


import java.util.Scanner;
import com.Customer;
import static util.CustValidationRule.*;

public class Tester {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		Customer[] cst;
		cst=new Customer[100];
		int counter = 0;
		boolean flag = false;
		
		while (flag == false) {

			System.out.println("1.Add Details 2.Link Adhar 3.Show All Customers 10.Exit");
			System.out.println("Enetr Your Choice:");
			int choice = sc.nextInt();
			
			try {
				switch (choice) {

				case 1:
					System.out.println("Enter: Name Email Password RegAmt DoB Memebership");

					cst[counter++] = validate(sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
					
					break;

				case 2:
					System.out.println("Enter Email to check if cutomer is registerd: ");
					Customer d = new Customer(sc.next());
					for(int i=0;i<cst.length;i++)
					{
					if(cst.equals(d))
					{
					System.out.println("Enter:Adhar No And Date");
					cst[i].linkAdhar(sc.next(), sc.next());
					}
					else
						System.out.println("Customer not found..!!!");
				  }
					break;
					
				case 3:
					for(Customer p:cst)
					{
						if(p!=null)
						System.out.println(p); 
					}
				}
			}

			catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
