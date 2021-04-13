package com.comINHARITANCE;

public class TdBank implements UsBank{

	public void chakingAccount() {
		 System.out.println("for chaking 500");	
	}
	public void savingAccount() {
		System.out.println("for chaking 5000");
		}
	public void craditAccount() {
		System.out.println("for chaking 1000");
		}
	public void loanAccount() {
		System.out.println("for chaking 1500");
	}
public static void main(String[] args) {
	TdBank k = new TdBank();
	k.chakingAccount();
	k.savingAccount();
	k.craditAccount();
	k.loanAccount();
	
}
}
