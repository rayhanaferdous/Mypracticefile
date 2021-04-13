package com.comINHARITANCE;

public class Childclass extends ParentClass {
public void car() {
	System.out.println("I have a BMW");
}

	public static void main(String[] args) {
		Childclass obj = new Childclass();
		obj.house();
		obj.car();
	}

}
