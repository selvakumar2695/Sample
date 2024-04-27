package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("company name :TCS");
	}
	public void companyId() {
		System.out.println("companyId:12345");
	}
	public void companyAddress() {
		System.out.println("companyAddress:1/2 Anna nagar");
	}
	public static void main(String args[]) {
		CompanyInfo C=new CompanyInfo();
		C.companyName();
		C.companyId();
		C.companyAddress();
	}
}
