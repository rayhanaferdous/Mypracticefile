package polymorphism;



public class MethodOverlodingB11C {
	public void ria(String name) {
		System.out.println("my name is"+ name);
	}

	    public void ria(int age) {
		System.out.println("my age is"+ age );
	  }


	    public void ria( int salary, String jobnam) {
	    	System.out.println("my salary is"+ salary +  "my job company name"+ jobnam);
	    }

	public static void main(String[] args) {
		MethodOverlodingB11C obj = new MethodOverlodingB11C();
		obj.ria(27);
		obj.ria("ria");
		obj.ria(1000, "omrani & toub");
	}
}
