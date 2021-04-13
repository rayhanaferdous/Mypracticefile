package com.comINHARITANCE;

public class BankofAmerica implements UsBank {

	public void chakingAccount() {
		System.out.println("for chaking 300");
		}
	public void savingAccount() {
		System.out.println("for chaking 900");
	}
	public void craditAccount() {
		System.out.println("for chaking 1500");
	}
	public void loanAccount() {
		System.out.println("for chaking 1000");
		}
	public static void main(String[] args) {
		BankofAmerica obj = new BankofAmerica();
		obj.chakingAccount();
		obj.savingAccount();
		obj.loanAccount();
		obj.craditAccount();
		
	}

	
}
