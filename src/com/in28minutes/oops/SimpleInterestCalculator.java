package com.in28minutes.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private String principal;
	private String interest;
//	private double noOfYears;

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = principal;
		this.interest = interest;
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal principal = new BigDecimal(this.principal);
		BigDecimal interest = new BigDecimal(this.interest).divide(new BigDecimal(100));
		BigDecimal years = new BigDecimal(noOfYears);
		BigDecimal result = principal.add(principal.multiply(interest).multiply(years));
		return result;
	}
}
