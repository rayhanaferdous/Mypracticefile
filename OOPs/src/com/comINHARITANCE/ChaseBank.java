package com.comINHARITANCE;

public class ChaseBank implements UsBank{
// bellow 1.7 user can do it
	@Override
	public void chakingAccount() {
		System.out.println("chaking deposit $1500" );
		
	}

	@Override
	public void savingAccount() {
		System.out.println("chaking deposit $150");
		
	}

	@Override
	public void craditAccount() {
		System.out.println("chaking deposit $100");
	}

	@Override
	public void loanAccount() {
	System.out.println("chaking deposit $10000");
		
	}
public static void main(String[] args) {
	ChaseBank obj = new ChaseBank();
	obj.chakingAccount();
	obj.loanAccount();
	obj.savingAccount();
	obj.craditAccount();
}

}
