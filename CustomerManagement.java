package tester;


import java.util.Scanner;
import com.Customer;
import static com.CustomerType.*;
import static util.CustValidationRule.*;

public class CustomerManagement {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Customer[] cst = new Customer[100];
		int counter = 0;
		boolean flag = false;
		
			while (flag == false) {

				System.out.println("1.Add Details 2.Link Adhar 3.Show All Customers 10.Exit");
				System.out.println("Enetr Your Choice:");
				int choice = sc.nextInt();
				sc.nextLine();
				System.out.println(choice);
				try {
				switch (choice) {

				case 1:

					System.out.println(SILVER);//directly nav takl tri print hoin toString chi grj nhi 
					System.out.println(GOLD.toString());
					System.out.println(DIAMOND.toString());
					System.out.println(PLATINUM.toString());
					System.out.println("----------------------");
					System.out.println("Enter: Name Email Password RegAmt DoB Memebership");

					cst[counter++] = validate(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next());
					sc.nextLine();

					break;

				case 2:
					int cnt = 0;
					System.out.println("Enter Email to check if cutomer is registerd: ");
					Customer d = new Customer(sc.next());
					for (int i = 0; i < cst.length; i++) {
						if (cst[i] != null) {
							if (cst[i].equals(d)) {
								System.out.println("Enter:Adhar No And Date");
								cst[i].linkAdhar(sc.next(), sc.next());
								cnt = cnt + 1;
							}
						}
					}
					System.out.println(cnt + " match found..!!!");

					break;

				case 3:
					for (Customer p : cst) {
						if (p != null)
							System.out.println(p);

					}
					break;
				case 10:
					flag = true;
					break;
				}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
			}
			
	}
}
