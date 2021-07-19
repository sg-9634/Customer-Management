package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private String name, email, passwd;
	private double regamt;
	private Date dob;
	private CustomerType type;
	private AdharDetails details;
	public static SimpleDateFormat sdf;
	static {

		sdf = new SimpleDateFormat("dd/MM/yyyy");

	}

	public Customer(String name, String email, String passwd, double regamt, Date dob, CustomerType type) {
		this.name = name;
		this.email = email;
		this.passwd = passwd;
		this.regamt = regamt;
		this.dob = dob;
		this.type = type;
	}

	public class AdharDetails {
		private String adharno;
		private Date issuedate;

		public AdharDetails(String adharno, Date issuedate) {

			this.adharno = adharno;
			this.issuedate = issuedate;
		}

		public String toString() {
			return ("Aadhar No: " + adharno + " " + "Date Of Issue: " + sdf.format(issuedate));
		}
	}

	public AdharDetails linkAdhar(String adharno, String issuedate) throws ParseException {   //can also use void type of method
		details = new AdharDetails(adharno, sdf.parse(issuedate));
		return details;

	}

	@Override
	public boolean equals(Object o)
	{
	
		return email.equals(((Customer)o).email);
		
	}
	public Customer(String email)
	{
		this.email=email;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		if (details == null)
			sb.append("Adhar is Not Linked.");
		else
			sb.append(details);
		return ("Name: " + name + " Email: " + email + " Password: " + passwd + " Reg Amount: " + regamt
				+ " Date Of Birth: " + sdf.format(dob) + " Type Of Membership: " + type + " Adhar:" +sb.toString());
	}

}

