package simpleInterestCalc;

import java.math.BigDecimal;

public class SimpleInterestCalc {

	BigDecimal principal;
	BigDecimal interest;
	
	public BigDecimal getPrincipal() {
		return principal;
	}


	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}


	public BigDecimal getInterest() {
		return interest;
	}


	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}


	public SimpleInterestCalc(String principal,String interest ) {
		// TODO Auto-generated constructor stub
	this.principal=new BigDecimal(principal);
	this.interest=new BigDecimal(interest);
	}
	public BigDecimal calcTotalValue(int years)
	{
		return principal.add(principal.multiply(interest).multiply(new BigDecimal(years)));
	 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring an object
		SimpleInterestCalc simpleInterest = new SimpleInterestCalc("4500.00","7.5");
		BigDecimal tot = simpleInterest.calcTotalValue(5);
		System.out.println(tot);

	}

}
