package com;

import java.util.Arrays;

public enum CustomerType {
	SILVER(500,new String[] {"Platform"}),
	GOLD(1000,new String[] {"Platform","Web Server"}),
	DIAMOND(1500,new String[] {"Platform","Web Server","App Deployment"})
	,PLATINUM(2000,new String[] {"Platform","Web Server","App Deployment","Docker"});
    
	private double charges;
     private String[] services;
     
     
	CustomerType(double charges, String[] services) {
		this.charges=charges;
		this.services=services;
		
	}
	
	public double getCharges() {
		return charges;
	}
	public String[] getServices() {
		return services;
	}
	
	

public String toString()
{
	return name() + "| Cahrges: "+charges+" | Services: "+ Arrays.toString(services);
}

   
}
