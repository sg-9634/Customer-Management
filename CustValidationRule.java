package util;
import com.Customer;
import com.CustomerType;
import static com.CustomerType.*;
import custom_exception.CustomerExceptionHadling;
import static com.Customer.*;
import java.text.ParseException;
public class CustValidationRule {
	
	public static Customer validate(String name,String email,String passwd,double regamt,String dob,String type) throws CustomerExceptionHadling,ParseException 
	{
		
		
		if(email.contains("@")==true && email.endsWith(".com")==true) 
			System.out.println("Email is vadid.");
		else
			throw new CustomerExceptionHadling("Email Must contain '@' and com...!!!");
		
		if(passwd.length()>4 && passwd.length()<10)
			System.out.println("Password is valid.");
		else
		throw new CustomerExceptionHadling("Password must contain min 4 and max 10 characters..!!!");
		
		
		//mebership validation
		CustomerType membership=CustomerType.valueOf(type.toUpperCase());//u can alos directly write rhs at palce of membership at below line.
		Customer c=new Customer(name,email,passwd,regamt,sdf.parse(dob),membership);
	
		if(regamt !=membership.getCharges())
		throw new CustomerExceptionHadling("Inavalid Plan is choosen...!!!"
				+ '\n'+SILVER + '\n'+GOLD + '\n'+DIAMOND + '\n'+PLATINUM);
		
		System.out.println("All Deails are valid.");
		return c;
		
	}

}
